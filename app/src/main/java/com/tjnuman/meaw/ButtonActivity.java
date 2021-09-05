package com.tjnuman.meaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ButtonActivity extends AppCompatActivity {
    ImageView catfact,catbreed,firstaid,vatcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        catbreed = findViewById(R.id.catbreed);
        catfact = findViewById(R.id.catfact);
        vatcall = findViewById(R.id.whentocallvat);
        firstaid = findViewById(R.id.firstaid);


//        catbreed.setOnClickListener(v -> {
//
//            final Intent i = new Intent(ButtonActivity.this, CatbreedActivity.class);
//            startActivity(i);
//        });

        catfact.setOnClickListener(v -> {

            final Intent i = new Intent(ButtonActivity.this, MainActivity.class);
            startActivity(i);
        });

        firstaid.setOnClickListener(v -> {

            final Intent i = new Intent(ButtonActivity.this, FirstaidActivity.class);
            startActivity(i);
        });

        vatcall.setOnClickListener(v -> {

            final Intent i = new Intent(ButtonActivity.this, VatcallActivity.class);
            startActivity(i);
        });


    }
}