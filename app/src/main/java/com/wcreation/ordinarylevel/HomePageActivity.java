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
import android.widget.TextView;
import android.widget.Toast;

import com.onesignal.OneSignal;
import com.wcreation.ordinarylevel.InfoAndPapers.DailyUpdateChoose;
import com.wcreation.ordinarylevel.InfoAndPapers.InformationUpdate;

public class HomePageActivity extends AppCompatActivity {

    CardView btnMPP,btnMMP,btnSbook,btnDUQA,btnInfoPage,btnSchoolPapers;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        setContentView(R.layout.activity_home_page);



        if (!isConnected()) {
            // new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert)
            // .setTitle("Internet Connection Alert(W Creation)")
            //  .setMessage("Please Check Your Internet Connection.")
            //  .setPositiveButton("Close", new DialogInterface.OnClickListener() {
            //    @Override
            //    public void onClick(DialogInterface dialog, int which) {
            //         finish();
            //     }
            //  });
            AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(this);
            alertdialogBuilder.setTitle("Internet Connection Problem");

            alertdialogBuilder.setIcon(android.R.drawable.ic_dialog_alert);
            alertdialogBuilder.setMessage("Please Check Your Internet Connection.");
            alertdialogBuilder.setCancelable(false);
            alertdialogBuilder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            alertdialogBuilder.setNegativeButton("Retry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Toast.makeText(MainActivity.this, "Close", Toast.LENGTH_SHORT).show();
                    recreate();
                }
            });
            AlertDialog alertDialog = alertdialogBuilder.create();
            alertDialog.show();


        } else {


            btnMPP = (CardView) findViewById(R.id.crdmathesPastPapers);
            btnMMP = (CardView) findViewById(R.id.crdmathesModle);
            btnSbook = (CardView) findViewById(R.id.crdmathesLesson);
            btnDUQA = (CardView) findViewById(R.id.crddailyUpdateQA);
            btnInfoPage = (CardView) findViewById(R.id.crdinformation);
            btnSchoolPapers = (CardView)findViewById(R.id.crdmathesSchoolPpr);

            context = this;


            btnMPP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomePageActivity.this, ExamPasspapers.class);
                    startActivity(i);
                }
            });

            btnMMP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomePageActivity.this, ModelPpers.class);
                    startActivity(i);
                }
            });

            btnDUQA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomePageActivity.this, DailyUpdateChoose.class);
                    startActivity(i);
                }
            });

            btnSbook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomePageActivity.this, GradeSelect.class);
                    startActivity(i);
                }
            });

            btnInfoPage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomePageActivity.this, InformationUpdate.class);
                    startActivity(i);
                }
            });

            btnSchoolPapers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomePageActivity.this, SchoolPapersActivity.class);
                    startActivity(i);
                }
            });

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



    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(this);
        alertdialogBuilder.setTitle("ඉවත්වීම තහවුරු කරන්න.!!");

        alertdialogBuilder.setIcon(R.drawable.ic_exit);
        alertdialogBuilder.setMessage("ඔබට සාමන්‍ය පෙළ ගණිතය APP එකෙන් ඉවත්වීමට අවශ්‍යද?");
        alertdialogBuilder.setCancelable(false);
        alertdialogBuilder.setPositiveButton("ඔව්", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertdialogBuilder.setNegativeButton("Rate Us", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                final String appPackageName = getPackageName();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
               // Toast.makeText(HomePageActivity.this, "ඔබ ඉවත්වීම අවලන්ගු කරන ලදී.", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=alertdialogBuilder.create();
        alertDialog.show();
    }

    private boolean isConnected()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo!= null && networkInfo.isConnected();
    }


}
