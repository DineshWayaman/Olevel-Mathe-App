package com.wcreation.ordinarylevel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.facebook.ads.*;
import com.wcreation.ordinarylevel.InfoAndPapers.DailyUpdateQuestionUpdate;
import com.wcreation.ordinarylevel.adapter.DailyUpdateRecyclerViewAdapter;
import com.wcreation.ordinarylevel.modal.Messages;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SchoolPapersActivity extends AppCompatActivity {

    private final String JSON_URL = "https://drive.google.com/u/3/uc?id=1DnDkcb067yEIqBHGHo-hpkTF3eAbrskA&export=download";
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;
    private List<Messages> lstAnime ;
    private RecyclerView recyclerView ;
    ProgressBar progressBar;
    private AdView adView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_papers);

        progressBar = (ProgressBar) findViewById(R.id.progressbarSchoolPapers);

        lstAnime = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerviewSchoolPapers);
        jsonrequest();

        context = this;

        AudienceNetworkAds.initialize(this);

        adView = new AdView(this, "1082372565497270_1082373332163860", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }

    private void jsonrequest() {

        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject  = null ;

                for (int i = 0 ; i < response.length(); i++ ) {


                    try {
                        jsonObject = response.getJSONObject(i) ;
                        Messages anime = new Messages() ;
                        anime.setMessage(jsonObject.getString("message"));
                        anime.setImage_URI(jsonObject.getString("img"));
                        lstAnime.add(anime);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }

                setuprecyclerview(lstAnime);
                progressBar.setVisibility(View.INVISIBLE);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        requestQueue = Volley.newRequestQueue(SchoolPapersActivity.this);
        requestQueue.add(request) ;
    }

    private void setuprecyclerview(List<Messages> lstAnime) {


        DailyUpdateRecyclerViewAdapter myadapter = new DailyUpdateRecyclerViewAdapter(this,lstAnime) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.actionAnotherAps:
                String url = "https://play.google.com/store/apps/developer?id=W+Creation";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                return true;

            case R.id.actionRateUs:
                // String url2 = "https://drive.google.com/file/d/1AnSQ_boqsK3zzoFcJjB-awtZ1KWITWtM/view?usp=sharing";
                //  Intent i2 = new Intent(Intent.ACTION_VIEW);
                //  i2.setData(Uri.parse(url2));
                //  startActivity(i2);
                //  return true;
                final String appPackageName = getPackageName();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                return false;

            case R.id.actionShareApp:
                final String shareappPackageName = getPackageName();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Download Now On Play Store:" + getResources().getString(R.string.app_name) + " App at: https://play.google.com/store/apps/details?id=" + shareappPackageName);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                return false;

            case R.id.actionAboutUs:
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.about_us_popup);
                TextView txtClose = (TextView) dialog.findViewById(R.id.txtClose);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                return false;

            case R.id.actionPrivacy:
                final Dialog dialog2 = new Dialog(context);
                dialog2.setContentView(R.layout.privacy_policy_popup);
                TextView txtClose2 = (TextView) dialog2.findViewById(R.id.txtClose);
                txtClose2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });
                dialog2.show();


            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}
