package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Act_directoryhouse extends AppCompatActivity {


//    RecyclerView recyclerView;
//    DatabaseReference database;
//    MyAdapter myAdapter;
//    ArrayList<House> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosuelist);

//        recyclerView = findViewById(R.id.recyclerview);
//        database = FirebaseDatabase.getInstance().getReference("House List");
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        list = new ArrayList<>();
//        myAdapter = new MyAdapter(this,list);
//        recyclerView.setAdapter(myAdapter);
//
//        database.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//
//
//                for (DataSnapshot dataSnapshot : snapshot.getChildren())
//                {
//
//                    House house = dataSnapshot.getValue((House.class));
//                    list.add(house);
//                }
//                myAdapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });




    }
}