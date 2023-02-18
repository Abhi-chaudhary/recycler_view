package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList<ContactMode> al=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 recyclerview variable
        RecyclerView recycleview=findViewById(R.id.RecyclerView);

        // layout of recyclerview
        recycleview.setLayoutManager(new LinearLayoutManager(this));
     for(int i=0;i<4;i++) {
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
         al.add(new ContactMode(R.drawable.photo, "Abhishek", "9876543210"));
     }

      RecycleContactAdapter adapter=new RecycleContactAdapter(this,al);
      recycleview.setAdapter(adapter);









    }
}