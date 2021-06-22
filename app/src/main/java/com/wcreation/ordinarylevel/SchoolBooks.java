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

import com.wcreation.ordinarylevel.GradeTen.Lessoneight;
import com.wcreation.ordinarylevel.GradeTen.Lessoneighty;
import com.wcreation.ordinarylevel.GradeTen.Lessoneleven;
import com.wcreation.ordinarylevel.GradeTen.Lessonfiftyne;
import com.wcreation.ordinarylevel.GradeTen.Lessonfive;
import com.wcreation.ordinarylevel.GradeTen.Lessonfortyne;
import com.wcreation.ordinarylevel.GradeTen.Lessonfour;
import com.wcreation.ordinarylevel.GradeTen.Lessonnine;
import com.wcreation.ordinarylevel.GradeTen.Lessonninty;
import com.wcreation.ordinarylevel.GradeTen.Lessonseven;
import com.wcreation.ordinarylevel.GradeTen.Lessonseventy;
import com.wcreation.ordinarylevel.GradeTen.Lessonsix;
import com.wcreation.ordinarylevel.GradeTen.Lessonsixty;
import com.wcreation.ordinarylevel.GradeTen.Lessonten;
import com.wcreation.ordinarylevel.GradeTen.Lessonthirty;
import com.wcreation.ordinarylevel.GradeTen.LessonthirtyOne;
import com.wcreation.ordinarylevel.GradeTen.LessonthirtyTwo;
import com.wcreation.ordinarylevel.GradeTen.Lessonthirtyne;
import com.wcreation.ordinarylevel.GradeTen.Lessonthree;
import com.wcreation.ordinarylevel.GradeTen.Lessontwelwe;
import com.wcreation.ordinarylevel.GradeTen.Lessontwenty;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyEight;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyFive;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyFour;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyNine;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyOne;
import com.wcreation.ordinarylevel.GradeTen.LessontwentySeven;
import com.wcreation.ordinarylevel.GradeTen.LessontwentySix;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyThree;
import com.wcreation.ordinarylevel.GradeTen.LessontwentyTwo;
import com.wcreation.ordinarylevel.GradeTen.Lessontwo;
import com.wcreation.ordinarylevel.GradeTen.Parimithiya;
import com.facebook.ads.*;

public class SchoolBooks extends AppCompatActivity {

    private CardView l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32;

    private AdView adView;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_books);


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
            l25 = (CardView) findViewById(R.id.l25);
            l26 = (CardView) findViewById(R.id.l26);
            l27 = (CardView) findViewById(R.id.l27);
            l28 = (CardView) findViewById(R.id.l28);
            l29 = (CardView) findViewById(R.id.l29);
            l30 = (CardView) findViewById(R.id.l30);
            l31 = (CardView) findViewById(R.id.l31);
            l32 = (CardView) findViewById(R.id.l32);


            l1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(SchoolBooks.this, Parimithiya.class);
                    startActivity(i);
                }
            });


            l2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(SchoolBooks.this, Lessontwo.class);
                    startActivity(i2);
                }
            });

            l3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(SchoolBooks.this, Lessonthree.class);
                    startActivity(i3);
                }
            });

            l4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i4 = new Intent(SchoolBooks.this, Lessonfour.class);
                    startActivity(i4);
                }
            });

            l5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i5 = new Intent(SchoolBooks.this, Lessonfive.class);
                    startActivity(i5);
                }
            });

            l6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i6 = new Intent(SchoolBooks.this, Lessonsix.class);
                    startActivity(i6);
                }
            });

            l7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i7 = new Intent(SchoolBooks.this, Lessonseven.class);
                    startActivity(i7);
                }
            });

            l8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i8 = new Intent(SchoolBooks.this, Lessoneight.class);
                    startActivity(i8);
                }
            });

            l9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i9 = new Intent(SchoolBooks.this, Lessonnine.class);
                    startActivity(i9);
                }
            });

            l10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i10 = new Intent(SchoolBooks.this, Lessonten.class);
                    startActivity(i10);
                }
            });


            l11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i11 = new Intent(SchoolBooks.this, Lessoneleven.class);
                    startActivity(i11);
                }
            });

            l12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i12 = new Intent(SchoolBooks.this, Lessontwelwe.class);
                    startActivity(i12);
                }
            });

            l13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i13 = new Intent(SchoolBooks.this, Lessonthirtyne.class);
                    startActivity(i13);
                }
            });

            l14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i14 = new Intent(SchoolBooks.this, Lessonfortyne.class);
                    startActivity(i14);
                }
            });

            l15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i15 = new Intent(SchoolBooks.this, Lessonfiftyne.class);
                    startActivity(i15);
                }
            });

            l16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i16 = new Intent(SchoolBooks.this, Lessonsixty.class);
                    startActivity(i16);
                }
            });

            l17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i17 = new Intent(SchoolBooks.this, Lessonseventy.class);
                    startActivity(i17);
                }
            });

            l18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i18 = new Intent(SchoolBooks.this, Lessoneighty.class);
                    startActivity(i18);
                }
            });


            l19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i19 = new Intent(SchoolBooks.this, Lessonninty.class);
                    startActivity(i19);
                }
            });


            l20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i20 = new Intent(SchoolBooks.this, Lessontwenty.class);
                    startActivity(i20);
                }
            });


            l21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i21 = new Intent(SchoolBooks.this, LessontwentyOne.class);
                    startActivity(i21);
                }
            });

            l22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i22 = new Intent(SchoolBooks.this, LessontwentyTwo.class);
                    startActivity(i22);
                }
            });


            l23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i23 = new Intent(SchoolBooks.this, LessontwentyThree.class);
                    startActivity(i23);
                }
            });


            l24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i24 = new Intent(SchoolBooks.this, LessontwentyFour.class);
                    startActivity(i24);
                }
            });


            l25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i25 = new Intent(SchoolBooks.this, LessontwentyFive.class);
                    startActivity(i25);
                }
            });


            l26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i26 = new Intent(SchoolBooks.this, LessontwentySix.class);
                    startActivity(i26);
                }
            });

            l27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i27 = new Intent(SchoolBooks.this, LessontwentySeven.class);
                    startActivity(i27);
                }
            });


            l28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i28 = new Intent(SchoolBooks.this, LessontwentyEight.class);
                    startActivity(i28);
                }
            });


            l29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i29 = new Intent(SchoolBooks.this, LessontwentyNine.class);
                    startActivity(i29);
                }
            });

            l30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i30 = new Intent(SchoolBooks.this, Lessonthirty.class);
                    startActivity(i30);
                }
            });

            l31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i31 = new Intent(SchoolBooks.this, LessonthirtyOne.class);
                    startActivity(i31);
                }
            });


            l32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i32 = new Intent(SchoolBooks.this, LessonthirtyTwo.class);
                    startActivity(i32);
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
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

}
