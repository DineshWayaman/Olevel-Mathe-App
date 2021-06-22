package com.wcreation.ordinarylevel.InfoAndPapers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.wcreation.ordinarylevel.R;

import org.w3c.dom.Text;

public class Information extends AppCompatActivity implements ValueEventListener {

    TextView info1,info2,info3,info4,info5,info6,info7,info8,info9,info10;
    ImageView img;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference firstDatabasetxt = databaseReference.child("info1");
    private DatabaseReference firstDatabasetxt2 = databaseReference.child("info2");
    private DatabaseReference firstDatabasetxt3 = databaseReference.child("info3");
    private DatabaseReference firstDatabasetxt4 = databaseReference.child("info4");
    private DatabaseReference firstDatabasetxt5 = databaseReference.child("info5");
    private DatabaseReference firstDatabasetxt6 = databaseReference.child("info6");
    private DatabaseReference firstDatabasetxt7 = databaseReference.child("info7");
    private DatabaseReference firstDatabasetxt8 = databaseReference.child("info8");
    private DatabaseReference firstDatabasetxt9 = databaseReference.child("info9");
    private DatabaseReference firstDatabasetxt10 = databaseReference.child("info10");
    private DatabaseReference infoimage = databaseReference.child("infoimg");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

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




            img = (ImageView) findViewById(R.id.img);

            info1 = (TextView) findViewById(R.id.info1);
            info2 = (TextView) findViewById(R.id.info2);
            info3 = (TextView) findViewById(R.id.info3);
            info4 = (TextView) findViewById(R.id.info4);
            info5 = (TextView) findViewById(R.id.info5);
            info6 = (TextView) findViewById(R.id.info6);
            info7 = (TextView) findViewById(R.id.info7);
            info8 = (TextView) findViewById(R.id.info8);
            info9 = (TextView) findViewById(R.id.info9);
            info10 = (TextView) findViewById(R.id.info10);


        }
    }

        @Override
        public void onDataChange (@NonNull DataSnapshot dataSnapshot){

            if (dataSnapshot.getValue(String.class) != null) {

                String key = dataSnapshot.getKey();
                if (key.equals("info1")) {

                    String info = dataSnapshot.getValue(String.class);
                    info1.setText(info);
                }
                if (key.equals("info2")) {

                    String info = dataSnapshot.getValue(String.class);
                    info2.setText(info);
                }
                if (key.equals("info3")) {

                    String info = dataSnapshot.getValue(String.class);
                    info3.setText(info);
                }
                if (key.equals("info4")) {

                    String info = dataSnapshot.getValue(String.class);
                    info4.setText(info);
                }

                if (key.equals("info5")) {

                    String info = dataSnapshot.getValue(String.class);
                    info5.setText(info);
                }
                if (key.equals("info6")) {

                    String info = dataSnapshot.getValue(String.class);
                    info6.setText(info);
                }
                if (key.equals("info7")) {

                    String info = dataSnapshot.getValue(String.class);
                    info7.setText(info);
                }
                if (key.equals("info8")) {

                    String info = dataSnapshot.getValue(String.class);
                    info8.setText(info);
                }
                if (key.equals("info9")) {

                    String info = dataSnapshot.getValue(String.class);
                    info9.setText(info);
                }
                if (key.equals("info10")) {

                    String info = dataSnapshot.getValue(String.class);
                    info10.setText(info);
                }
                if (key.equals("infoimg")) {

                    String imgAnsLink = dataSnapshot.getValue(String.class);
                    Picasso.get().load(imgAnsLink).into(img);

                }
            }
        }


    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }



    private boolean isConnected()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo!= null && networkInfo.isConnected();
    }


    @Override
    protected void onStart() {
        super.onStart();
        firstDatabasetxt.addValueEventListener(this);
        firstDatabasetxt2.addValueEventListener(this);
        firstDatabasetxt3.addValueEventListener(this);
        firstDatabasetxt4.addValueEventListener(this);
        firstDatabasetxt5.addValueEventListener(this);
        firstDatabasetxt6.addValueEventListener(this);
        firstDatabasetxt7.addValueEventListener(this);
        firstDatabasetxt8.addValueEventListener(this);
        firstDatabasetxt9.addValueEventListener(this);
        firstDatabasetxt10.addValueEventListener(this);
        infoimage.addValueEventListener(this);

    }
}
