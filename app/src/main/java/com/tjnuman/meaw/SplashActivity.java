package com.tjnuman.meaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    Animation topAnimation, bottomAnimation;
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animationView = findViewById(R.id.animationView);

        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.downtotop);
        animationView.setAnimation(bottomAnimation);

//        topAnimation = AnimationUtils.loadAnimation(this,R.anim.toptodown);
//        animationView.setAnimation(topAnimation);



        final Intent i = new Intent(SplashActivity.this, ButtonActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        }, 4555);




    }
}