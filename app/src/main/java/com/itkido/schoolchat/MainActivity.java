package com.itkido.schoolchat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInExistingUser();

    }

    private void signInExistingUser() {
        Button login_sign_in_button = (Button) findViewById(R.id.login_sign_in_button);
        login_sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_home.class));
            }
        });

    }


}
