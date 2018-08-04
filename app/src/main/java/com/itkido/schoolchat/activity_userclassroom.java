package com.itkido.schoolchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_userclassroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userclassroom);
        gotoHome();
        gotoProfile();
        gotoClassroom();
        goToStudents();
        goToChat();
    }

    private void gotoHome() {
        Button btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_userclassroom.this, activity_home.class));
            }
        });
    }
    private void gotoClassroom() {
        Button btnClassrooms = (Button) findViewById(R.id.btnClassrooms);
        btnClassrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_userclassroom.this, activity_classroom.class));
            }
        });
    }
    private void gotoProfile() {
        Button btnProfile = (Button) findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_userclassroom.this, activity_profile.class));
            }
        });
    }

    private void goToStudents() {
        Button btnStudents = (Button) findViewById(R.id.btnStudents);
        btnStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_userclassroom.this, activity_students.class));
            }
        });
    }

    private void goToChat() {
        Button btnChat = (Button) findViewById(R.id.btnChat);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_userclassroom.this, activity_userchat.class));
            }
        });
    }

}
