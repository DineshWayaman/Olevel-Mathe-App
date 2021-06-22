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
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.wcreation.ordinarylevel.ModelPapers.ModelPaper1Part1;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper1Part1Answer;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper1Part2;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper1Part2Answer;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper2Part1;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper2Part2;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper2Part2Answer;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper3;
import com.wcreation.ordinarylevel.ModelPapers.ModelPaper3Answer;
import com.facebook.ads.*;

public class ModelPpers extends AppCompatActivity {

    private CardView modelppr1prt1,modelppr1prt2,modelppr2prt1,modelppr2prt2,modelppr3,modelppr1prt1ans,modelppr1prt2ans,modelppr2prt1ans,modelppr2prt2ans,modelppr3ans;
    private AdView adView;
    Context context;


    private final String TAG = ModelPpers.class.getSimpleName();
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_ppers);

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



            modelppr1prt1 = findViewById(R.id.modelppr1prt1);
            modelppr1prt2 = findViewById(R.id.modelppr1prt2);
            modelppr2prt1 = findViewById(R.id.modelppr2prt1);
            modelppr2prt2 = findViewById(R.id.modelppr2prt2);
            modelppr3 = findViewById(R.id.modelppr3);

            modelppr1prt1ans = findViewById(R.id.modelppr1prt1ans);
            modelppr1prt2ans = findViewById(R.id.modelppr1prt2sns);
            modelppr2prt1ans = findViewById(R.id.modelppr2prt1ans);
            modelppr2prt2ans = findViewById(R.id.modelppr2prt2ans);
            modelppr3ans = findViewById(R.id.modelppr3ans);

            modelppr1prt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ModelPpers.this, ModelPaper1Part1.class);
                    startActivity(i);
                }
            });

            modelppr1prt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(ModelPpers.this, ModelPaper1Part2.class);
                    startActivity(i2);
                }
            });

            modelppr2prt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(ModelPpers.this, ModelPaper2Part1.class);
                    startActivity(i3);
                }
            });

            modelppr2prt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i4 = new Intent(ModelPpers.this, ModelPaper2Part2.class);
                    startActivity(i4);
                }
            });

            modelppr3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i5 = new Intent(ModelPpers.this, ModelPaper3.class);
                    startActivity(i5);
                }
            });


            modelppr1prt1ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i6 = new Intent(ModelPpers.this, ModelPaper1Part1Answer.class);
                    startActivity(i6);
                }
            });

            modelppr1prt2ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i7 = new Intent(ModelPpers.this, ModelPaper1Part2Answer.class);
                    startActivity(i7);
                }
            });


            modelppr2prt1ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i8 = new Intent(ModelPpers.this, ModelPaper2Part1.class);
                    startActivity(i8);
                }
            });

            modelppr2prt2ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i9 = new Intent(ModelPpers.this, ModelPaper2Part2Answer.class);
                    startActivity(i9);
                }
            });

            modelppr3ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i10 = new Intent(ModelPpers.this, ModelPaper3Answer.class);
                    startActivity(i10);
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


            interstitialAd = new InterstitialAd(this, "1082372565497270_1082376082163585");
            // Set listeners for the Interstitial Ad
            interstitialAd.setAdListener(new InterstitialAdListener() {
                @Override
                public void onInterstitialDisplayed(Ad ad) {
                    // Interstitial ad displayed callback
                    Log.e(TAG, "Interstitial ad displayed.");
                }

                @Override
                public void onInterstitialDismissed(Ad ad) {
                    // Interstitial dismissed callback
                    Log.e(TAG, "Interstitial ad dismissed.");
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    // Ad error callback
                    Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    // Interstitial ad is loaded and ready to be displayed
                    Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                    // Show the ad
                    interstitialAd.show();
                }

                @Override
                public void onAdClicked(Ad ad) {
                    // Ad clicked callback
                    Log.d(TAG, "Interstitial ad clicked!");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    // Ad impression logged callback
                    Log.d(TAG, "Interstitial ad impression logged!");
                }
            });

            // For auto play video ads, it's recommended to load the ad
            // at least 30 seconds before it is shown
            interstitialAd.loadAd();


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
