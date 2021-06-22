package com.wcreation.ordinarylevel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.wcreation.ordinarylevel.InfoAndPapers.DailyUpdateQuestion;
import com.wcreation.ordinarylevel.InfoAndPapers.Information;

public class NewInfoandPapers extends AppCompatActivity {

    private CardView dailyupdt,olevelinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_infoand_papers);



        dailyupdt = (CardView) findViewById(R.id.dailyupdateppr);
        olevelinfo = (CardView) findViewById(R.id.olevelinfo);

        dailyupdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewInfoandPapers.this, DailyUpdateQuestion.class);
                startActivity(i);
            }
        });

        olevelinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewInfoandPapers.this, Information.class);
                startActivity(i);
            }
        });
    }



    @Override
    public void onBackPressed() {

            super.onBackPressed();

    }

}
