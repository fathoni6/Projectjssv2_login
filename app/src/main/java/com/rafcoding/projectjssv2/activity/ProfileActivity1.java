package com.rafcoding.projectjssv2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rafcoding.projectjssv2.R;

public class ProfileActivity1 extends AppCompatActivity {

    Button btn_setting_profile,btn_keluar_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);

        btn_setting_profile = findViewById(R.id.btn_setting_profile);

        btn_setting_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotosettingprofile = new Intent(ProfileActivity1.this,ProfileActivity2.class);
                startActivity(gotosettingprofile);
            }
        });
    }
}