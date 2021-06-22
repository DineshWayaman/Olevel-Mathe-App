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

import com.wcreation.ordinarylevel.GradeEleven.GradeElevenEight;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenEightyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenEleven;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenFiftyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenFive;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenFour;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenFourtyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenNine;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenNintyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenOne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenSeven;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenSeventyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenSix;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenSixtyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTen;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenThirtyne;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenThree;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwelwe;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwenty;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwentyFour;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwentyThree;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwentyTwo;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwenty_one;
import com.wcreation.ordinarylevel.GradeEleven.GradeElevenTwo;

public class SchoolBooksGradeeleven extends AppCompatActivity {

    private CardView l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_books_gradeeleven);

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

            l1 = (CardView) findViewById(R.id.l1);
            l2 = (CardView) findViewById(R.id.l2);
            l3 = (CardView) findViewById(R.id.l3);
            l4 = (CardView) findViewById(R.id.l4);
            l5 = (CardView) findViewById(R.id.l5);
            l6 = (CardView) findViewById(R.id.l6);
            l7 = (CardView) findViewById(R.id.l7);
            l8 = (CardView) findViewById(R.id.l8);
            l9 = (CardView) findViewById(R.id.l9);
            l10 = (CardView) findViewById(R.id.l10);
            l11 = (CardView) findViewById(R.id.l11);
            l12 = (CardView) findViewById(R.id.l12);
            l13 = (CardView) findViewById(R.id.l13);
            l14 = (CardView) findViewById(R.id.l14);
            l15 = (CardView) findViewById(R.id.l15);
            l16 = (CardView) findViewById(R.id.l16);
            l17 = (CardView) findViewById(R.id.l17);
            l18 = (CardView) findViewById(R.id.l18);
            l19 = (CardView) findViewById(R.id.l19);
            l20 = (CardView) findViewById(R.id.l20);
            l21 = (CardView) findViewById(R.id.l21);
            l22 = (CardView) findViewById(R.id.l22);
            l23 = (CardView) findViewById(R.id.l23);
            l24 = (CardView) findViewById(R.id.l24);


            l1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(SchoolBooksGradeeleven.this, GradeElevenOne.class);
                    startActivity(i);
                }
            });


            l2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwo.class);
                    startActivity(i2);
                }
            });

            l3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(SchoolBooksGradeeleven.this, GradeElevenThree.class);
                    startActivity(i3);
                }
            });

            l4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i4 = new Intent(SchoolBooksGradeeleven.this, GradeElevenFour.class);
                    startActivity(i4);
                }
            });

            l5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i5 = new Intent(SchoolBooksGradeeleven.this, GradeElevenFive.class);
                    startActivity(i5);
                }
            });

            l6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i6 = new Intent(SchoolBooksGradeeleven.this, GradeElevenSix.class);
                    startActivity(i6);
                }
            });

            l7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i7 = new Intent(SchoolBooksGradeeleven.this, GradeElevenSeven.class);
                    startActivity(i7);
                }
            });

            l8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i8 = new Intent(SchoolBooksGradeeleven.this, GradeElevenEight.class);
                    startActivity(i8);
                }
            });

            l9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i9 = new Intent(SchoolBooksGradeeleven.this, GradeElevenNine.class);
                    startActivity(i9);
                }
            });

            l10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i10 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTen.class);
                    startActivity(i10);
                }
            });


            l11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i11 = new Intent(SchoolBooksGradeeleven.this, GradeElevenEleven.class);
                    startActivity(i11);
                }
            });

            l12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i12 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwelwe.class);
                    startActivity(i12);
                }
            });

            l13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i13 = new Intent(SchoolBooksGradeeleven.this, GradeElevenThirtyne.class);
                    startActivity(i13);
                }
            });

            l14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i14 = new Intent(SchoolBooksGradeeleven.this, GradeElevenFourtyne.class);
                    startActivity(i14);
                }
            });

            l15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i15 = new Intent(SchoolBooksGradeeleven.this, GradeElevenFiftyne.class);
                    startActivity(i15);
                }
            });

            l16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i16 = new Intent(SchoolBooksGradeeleven.this, GradeElevenSixtyne.class);
                    startActivity(i16);
                }
            });

            l17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i17 = new Intent(SchoolBooksGradeeleven.this, GradeElevenSeventyne.class);
                    startActivity(i17);
                }
            });

            l18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i18 = new Intent(SchoolBooksGradeeleven.this, GradeElevenEightyne.class);
                    startActivity(i18);
                }
            });


            l19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i19 = new Intent(SchoolBooksGradeeleven.this, GradeElevenNintyne.class);
                    startActivity(i19);
                }
            });


            l20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i20 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwenty.class);
                    startActivity(i20);
                }
            });


            l21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i21 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwenty_one.class);
                    startActivity(i21);
                }
            });

            l22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i22 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwentyTwo.class);
                    startActivity(i22);
                }
            });


            l23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i23 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwentyThree.class);
                    startActivity(i23);
                }
            });


            l24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i24 = new Intent(SchoolBooksGradeeleven.this, GradeElevenTwentyFour.class);
                    startActivity(i24);
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

    private boolean isConnected()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo!= null && networkInfo.isConnected();
    }
}
