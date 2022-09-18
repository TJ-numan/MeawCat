package com.tjnuman.meaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    Animation topAnimation, bottomAnimation;
    RelativeLayout topimage;
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animationView = findViewById(R.id.animationView);
        topimage = findViewById(R.id.topimage);

        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.downtotop);
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.toptodown);

        animationView.setAnimation(bottomAnimation);
        topimage.setAnimation(topAnimation);



        final Intent i = new Intent(SplashActivity.this, ButtonActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        }, 3555);




    }
}