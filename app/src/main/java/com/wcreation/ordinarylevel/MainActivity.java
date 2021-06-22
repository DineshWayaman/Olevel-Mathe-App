package com.wcreation.ordinarylevel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    CardView crdmathemtics,crdpastpapers,crdtimpapers,crdinfo,crdappdownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crdmathemtics = (CardView) findViewById(R.id.crdmathemtics);
        crdpastpapers = (CardView) findViewById(R.id.crdpastpapers);
        crdtimpapers = (CardView) findViewById(R.id.crdtimpapers);
        crdinfo = (CardView) findViewById(R.id.crdinfo);
        crdappdownload = (CardView)findViewById(R.id.downloadPcorner);

        crdappdownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=com.wcreation.pastcorner";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        crdmathemtics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,GradeSelect.class);
                startActivity(i);
            }
        });




        crdpastpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ExamPasspapers.class);
                startActivity(i);
            }
        });

            crdtimpapers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, ModelPpers.class);
                    startActivity(i);
                }
            });


        crdinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NewInfoandPapers.class);
                startActivity(i);
            }
        });

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

        alertdialogBuilder.setNegativeButton("නැත", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "ඔබ ඉවත්වීම අවලන්ගු කරන ලදී.", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=alertdialogBuilder.create();
        alertDialog.show();
    }
}
