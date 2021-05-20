package com.tna.yourtna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AccountSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        ImageView btn_resetPass = findViewById(R.id.resetPassword);
        btn_resetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PasswordReset.class);
                startActivity(intent);
            }
        });
        ImageView btn_resetEmail = findViewById(R.id.resetEmail);
        btn_resetEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),EmailReset.class);
                startActivity(intent);
            }
        });
        ImageView btn_editProfile = findViewById(R.id.editProfile);
        btn_editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProfileReset.class);
                startActivity(intent);
            }
        });
        ImageView btn_editTNA = findViewById(R.id.editTNA);
        btn_editTNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TNAReset.class);
                startActivity(intent);
            }
        });
        ImageView btn_shareTNA = findViewById(R.id.shareTNA);
        btn_shareTNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShareTNA.class);
                startActivity(intent);
            }
        });
        ImageView btn_settings = findViewById(R.id.settings);
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SettingsApp.class);
                startActivity(intent);
            }
        });
        ImageView btn_thumbUp = findViewById(R.id.thumbUp);
        btn_thumbUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SocialNetworksThumbUP.class);
                startActivity(intent);
            }
        });
        ImageView btn_aboutUS = findViewById(R.id.aboutUS);
        btn_aboutUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutUS.class);
                startActivity(intent);
            }
        });
    }
}