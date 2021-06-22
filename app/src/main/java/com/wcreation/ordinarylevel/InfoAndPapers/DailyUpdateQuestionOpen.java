package com.wcreation.ordinarylevel.InfoAndPapers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.chrisbanes.photoview.PhotoView;
import com.wcreation.ordinarylevel.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DailyUpdateQuestionOpen extends AppCompatActivity {

    PhotoView img;

    Bitmap bitmap;
    private static final int WRITE_EXTERNAL_STORAGE_CODE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_update_question_open);

        String message  = getIntent().getExtras().getString("anime_message");
        String image_url = getIntent().getExtras().getString("anime_img") ;

        img = findViewById(R.id.imgOpen);
        TextView tv_massage = findViewById(R.id.txtOpen);

        tv_massage.setText(message);

        RequestOptions requestOptions = new RequestOptions().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        Glide.with(this).load(image_url).apply(requestOptions).into(img);





    }


}
