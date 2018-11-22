package com.example.georgesamuel.darslidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    EditText edtUserName;
    EditText edtPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();
    }

    private void initUI() {
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    void login() {
        String userName = edtUserName.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (userName.isEmpty()) {
            edtUserName.setError("من فضلك قم بادخال اسم المستخدم");
        } else if (password.isEmpty()) {
            edtPassword.setError("من فضلك قم بادخال كلمة المرور");
        } else if (password.length() < 8) {
            edtPassword.setError("من فضلك قم بادخال رقم مرور صحيح");

        } else {
            navigateToHome();
        }
    }

    private void navigateToHome() {
        Intent intent = new Intent(this, MaterialActivity.class);
        startActivity(intent);

    }
}
