package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_registration_user extends AppCompatActivity {

    EditText userFullName , userEmail , userPassword , userContact ;
    Button btn_register ;

//    private DatabaseReference mDatabase;


//    FirebaseDatabase firebaseDatabase ;
//    DatabaseReference databaseReference ;
    UserInfo userInfo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_user);

//        mDatabase = FirebaseDatabase.getInstance().getReference();

        userFullName = findViewById(R.id.id_fullname_newuser);
        userEmail = findViewById(R.id.id_email_newuser);
        userPassword = findViewById(R.id.id_password_newuser);
        btn_register = findViewById(R.id.btn_regitser);

//        firebaseDatabase = FirebaseDatabase.getInstance();
//        databaseReference = firebaseDatabase.getReference("userInfo");

        userInfo = new UserInfo();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = userFullName.getText().toString();
                String email = userEmail.getText().toString();
                String password = userPassword.getText().toString();
                String mobileNo = userContact.getText().toString();

                if(TextUtils.isEmpty(name) && TextUtils.isEmpty(email) && TextUtils.isEmpty(password) && TextUtils.isEmpty(mobileNo)) {
                    Toast.makeText(Activity_registration_user.this, "Please Add some data", Toast.LENGTH_SHORT).show();
                }
                else {
//                    addUserInfoToFirebase(name, email , password , mobileNo);
//                    FirebaseDatabase.getInstance().getReference().child("TestObj").setValue("TestValue");

//                    public void writeNewUser(String userId, String name, String email) {
//                        User user = new User(name, email);
//
//                        mDatabase.child("users").child(userId).setValue(user);
//                    }

                    Intent intent = new Intent(view.getContext() , Activity_reg_successful.class);
                    intent.putExtra("name",name);
                    intent.putExtra("email",email);
                    startActivity(intent);
//                finish();
                }



            }
        });
    }


//            private void addUserInfoToFirebase(String name, String email, String password, String mobileNo) {
//
//                userInfo.setUserFullName(name);
//                userInfo.setUserEmail(email);
//                userInfo.setUserPassword(password);
//                userInfo.setUserContact(mobileNo);
//
//                databaseReference.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                        databaseReference.setValue(userInfo);
//                        Toast.makeText(activity_registration_user.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//                        Toast.makeText(activity_registration_user.this, "Registration Failed" + databaseError, Toast.LENGTH_SHORT).show();
//                    }
//                });

//            }

}