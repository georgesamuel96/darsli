package com.example.georgesamuel.darslidemo;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SignupLogout extends AppCompatActivity {

    Button stu, teacher;
    LinearLayout stu_linear, teacher_linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_logout);

        stu = (Button)findViewById(R.id.btn_stu);
        teacher = (Button)findViewById(R.id.btn_teacher);
        stu_linear = (LinearLayout)findViewById(R.id.stu);
        teacher_linear = (LinearLayout)findViewById(R.id.teacher);

        stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teacher_linear.setVisibility(View.GONE);
                stu_linear.setVisibility(View.VISIBLE);
                stu.setBackgroundColor(ContextCompat.getColor(SignupLogout.this,android.R.color.white));

                teacher.setBackgroundColor(ContextCompat.getColor(SignupLogout.this,android.R.color.darker_gray));
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stu_linear.setVisibility(View.GONE);
                teacher_linear.setVisibility(View.VISIBLE);
                teacher.setBackgroundColor(ContextCompat.getColor(SignupLogout.this,android.R.color.white));

                stu.setBackgroundColor(ContextCompat.getColor(SignupLogout.this,android.R.color.darker_gray));

            }
        });
    }
}
