package com.example.mapapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class InformationAboutMarkActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.information_about_mark_activity);
            ImageView imageView = findViewById(R.id.imageView2);
            ImageView imageView1 = findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.love_fonk);
            imageView1.setImageResource(R.drawable.png_130);
        }
    }

