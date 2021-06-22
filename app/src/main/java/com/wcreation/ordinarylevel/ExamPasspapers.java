package com.wcreation.ordinarylevel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.wcreation.ordinarylevel.PastPapers.PastPaper2013;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2015;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2016Part1;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2016Part2;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2017Part1;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2017Part2;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2018Part1;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2018Part2;
import com.wcreation.ordinarylevel.PastPapers.PastPaper2019;
import com.facebook.ads.*;

public class ExamPasspapers extends AppCompatActivity {

    private CardView ppr2013,ppr2015,ppr2016part1,ppr2016part2,ppr2017part1,ppr2017part2,ppr2018part1,ppr2018part2,ppr2019;

    private AdView adView;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_passpapers);



        if (!isConnected()) {
            new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Internet Connection Alert(W Creation)")
                    .setMessage("Please Check Your Internet Connection.")
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }).show();
        } else {



            context = this;

            ppr2013 = findViewById(R.id.ppr2013);
            ppr2015 = findViewById(R.id.ppr2015);
            ppr2016part1 = findViewById(R.id.ppr2016part1);
            ppr2016part2 = findViewById(R.id.ppr2016part2);
            ppr2017part1 = findViewById(R.id.ppr2017part1);
            ppr2017part2 = findViewById(R.id.ppr2017part2);
            ppr2018part1 = findViewById(R.id.ppr2018part1);
            ppr2018part2 = findViewById(R.id.ppr2018part2);
            ppr2019 = findViewById(R.id.ppr2019);

            ppr2013.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(ExamPasspapers.this, PastPaper2013.class);
                    startActivity(i);

                }
            });

            ppr2015.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(ExamPasspapers.this, PastPaper2015.class);
                    startActivity(i2);
                }
            });

            ppr2016part1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(ExamPasspapers.this, PastPaper2016Part1.class);
                    startActivity(i3);
                }
            });

            ppr2016part2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i4 = new Intent(ExamPasspapers.this, PastPaper2016Part2.class);
                    startActivity(i4);
                }
            });

            ppr2017part1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i5 = new Intent(ExamPasspapers.this, PastPaper2017Part1.class);
                    startActivity(i5);
                }
            });


            ppr2017part2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i6 = new Intent(ExamPasspapers.this, PastPaper2017Part2.class);
                    startActivity(i6);
                }
            });

            ppr2018part1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i7 = new Intent(ExamPasspapers.this, PastPaper2018Part1.class);
                    startActivity(i7);
                }
            });

            ppr2018part2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i8 = new Intent(ExamPasspapers.this, PastPaper2018Part2.class);
                    startActivity(i8);
                }
            });


            ppr2019.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i7 = new Intent(ExamPasspapers.this, PastPaper2019.class);
                    startActivity(i7);
                }
            });


            AudienceNetworkAds.initialize(this);


            adView = new AdView(this, "1082372565497270_1082373332163860", AdSize.BANNER_HEIGHT_50);

            // Find the Ad Container
            LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

            // Add the ad view to your activity layout
            adContainer.addView(adView);

            // Request an ad
            adView.loadAd();


        }
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


    private boolean isConnected()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo!= null && networkInfo.isConnected();
    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}

