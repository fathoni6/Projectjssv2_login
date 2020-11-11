package com.rafcoding.projectjssv2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rafcoding.projectjssv2.R;

public class ProfileActivity2 extends AppCompatActivity {

    Button btn_back_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        btn_back_profile = findViewById(R.id.btn_back_profile);

        btn_back_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtoprofil = new Intent(ProfileActivity2.this,ProfileActivity1.class);
                startActivity(backtoprofil);
            }
        });
    }
}