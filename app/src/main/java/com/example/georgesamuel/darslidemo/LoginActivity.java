package com.example.georgesamuel.darslidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private SharedPrefConfig sharedPreferenceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPref();
}

    public void SharedPref()
    {
        sharedPreferenceConfig = new SharedPrefConfig(getApplicationContext());

        if(sharedPreferenceConfig.getLoginStatus())
        {
            /*Intent i = new Intent(LoginActivity.this, homepage.class);
            startActivity(i);*/
            finish();
        }
    }
}
