package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView txtAppName = findViewById(R.id.id_splash_app_name);
        TextView splash_tagline = findViewById(R.id.tagline);

        Animation alphaOnAppName = AnimationUtils.loadAnimation(Splash_activity.this, R.anim.alpha_animation);
        Animation translateOnTagline = AnimationUtils.loadAnimation(Splash_activity.this, R.anim.translate_animation);

        txtAppName.setAnimation(alphaOnAppName);
        splash_tagline.setAnimation(translateOnTagline);

        // Handler for - Splash Screen Running Time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent selectRole = new Intent(Splash_activity.this, Activity_typeofuser.class);
                startActivity(selectRole);
                finish();
            }
        },8000);
    }
}