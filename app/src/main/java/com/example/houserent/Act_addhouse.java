package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Act_addhouse extends AppCompatActivity {

    private EditText name, number, type, rent, city;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference referencene = db.getReference().child("House List");

        setContentView(R.layout.activity_addhouseactivity);
        name = findViewById(R.id.ownernameet);
        number = findViewById(R.id.ownernumberet);
        type = findViewById(R.id.housetypeet);
        rent = findViewById(R.id.rentamountet);
        city = findViewById(R.id.cityet);
        btn = findViewById(R.id.addhousebtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String mname = name.getText().toString();
                String mnumber = number.getText().toString();
                String mtype = type.getText().toString();
                String mrent = rent.getText().toString();
                String mcity = city.getText().toString();
                House1 house1 = new House1(mname, mnumber, mtype, mrent, mcity);
                referencene.setValue(house1);

            }
        });


    }
}
