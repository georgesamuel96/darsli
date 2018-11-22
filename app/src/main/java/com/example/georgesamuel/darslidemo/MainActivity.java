package com.example.georgesamuel.darslidemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Handler timer;
    boolean isLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isLogin = new SharedPrefConfig(this).getLoginStatus();
        timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToNext(isLogin);

            }
        }, 2000L);

    }

    private void navigateToNext(Boolean isLogin) {
        Intent intent = null;
        if (isLogin) {
            intent = new Intent(this, MaterialActivity.class);
        } else {
            intent = new Intent(this, LoginActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
