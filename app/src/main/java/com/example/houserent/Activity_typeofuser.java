package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_typeofuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeofuser);


        CardView cv_admin = findViewById(R.id.cv_admin);
        CardView cv_user = findViewById(R.id.cv_user);

        cv_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_login_admin = new Intent(Activity_typeofuser.this , Activity_login_admin.class);
                startActivity(act_login_admin);
            }
        });


        cv_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_login_user = new Intent(Activity_typeofuser.this , Activity_neworexistinguser.class);
                startActivity(act_login_user);
            }
        });



//        Intent act_admin_login = new Intent(activity_typeofuser.this, activity_login_admin.class);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(act_admin_login);
//            }
//        },3000);


    }
}