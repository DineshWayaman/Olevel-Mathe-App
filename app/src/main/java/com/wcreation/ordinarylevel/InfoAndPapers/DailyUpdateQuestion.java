package com.wcreation.ordinarylevel.InfoAndPapers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.wcreation.ordinarylevel.R;
import com.facebook.ads.*;

public class DailyUpdateQuestion extends AppCompatActivity implements ValueEventListener {

    TextView txtalert;
    ImageView imgQuestion,imgAnswer;
    private AdView adView;


    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference firstDatabasetxt = databaseReference.child("alerttext");
    private DatabaseReference questionImage = databaseReference.child("QuestionImage");
    private DatabaseReference answerImage = databaseReference.child("AnswerImage");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_update_question);





        if (!isConnected()) {
            new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Internet Connection Error.!!")
                    .setMessage("Please Check Your Internet Connection.")
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }).show();
        } else {


            txtalert = (TextView) findViewById(R.id.alert);
            imgQuestion = (ImageView) findViewById(R.id.imgQuestion);
            imgAnswer = (ImageView) findViewById(R.id.imgAnswer);


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
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

        if (dataSnapshot.getValue(String.class)!=null){

            String key = dataSnapshot.getKey();
            if (key.equals("alerttext")){

                String alert = dataSnapshot.getValue(String.class);
                txtalert.setText(alert);
            }
            if (key.equals("QuestionImage")){

                String imgLink = dataSnapshot.getValue(String.class);
                Picasso.get().load(imgLink).into(imgQuestion);

            }
            if (key.equals("AnswerImage")){

                String imgAnsLink = dataSnapshot.getValue(String.class);
                Picasso.get().load(imgAnsLink).into(imgAnswer);

            }

        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        firstDatabasetxt.addValueEventListener(this);
        questionImage.addValueEventListener(this);
        answerImage.addValueEventListener(this);

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
