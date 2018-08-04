package com.itkido.schoolchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class activity_home extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mClassNames = new ArrayList<>();
    private ArrayList<String> mClassImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
        gotoClassroom();
        gotoProfile();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");

        mClassImageUrls.add("http://icons.iconarchive.com/icons/flat-icons.com/flat/256/Pencil-icon.png");
        mClassNames.add("Science");


        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mClassNames, mClassImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void gotoClassroom() {
        Button btnClassrooms = (Button) findViewById(R.id.btnClassrooms);
        btnClassrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_home.this, activity_classroom.class));
            }
        });
    }

    private void gotoProfile() {
        Button btnProfile = (Button) findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_home.this, activity_profile.class));
            }
        });
    }

}
