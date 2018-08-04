package com.itkido.schoolchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        gotoClassroom();
        gotoHome();
    }

    private void gotoClassroom() {
        Button btnClassrooms = (Button) findViewById(R.id.btnClassrooms);
        btnClassrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_profile.this, activity_classroom.class));
            }
        });
    }

    private void gotoHome() {
        Button btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_profile.this, activity_home.class));
            }
        });
    }
}
