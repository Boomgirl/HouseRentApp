package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_selectcity extends AppCompatActivity {

    CardView cv_mumbai ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectcity);

        cv_mumbai = findViewById(R.id.cv_img_mumbai);

        cv_mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dir = new Intent(getApplicationContext() , Activity_house_listing.class);
                startActivity(dir);
            }
        });


    }
}