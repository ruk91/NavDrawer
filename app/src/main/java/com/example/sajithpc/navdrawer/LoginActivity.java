package com.example.sajithpc.navdrawer;


import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Toast;

import com.example.sajithpc.navdrawer.MainActivity;
import com.example.sajithpc.navdrawer.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout userName;
    private TextInputLayout password;
    private View btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (TextInputLayout) findViewById(R.id.username_field);
        password = (TextInputLayout) findViewById(R.id.pass_field);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getEditText().getText().toString().trim().equals("")) {
                    Toast.makeText(LoginActivity.this, "Please input your user name", Toast.LENGTH_SHORT).show();
                } else if (password.getEditText().getText().toString().trim().equals("")) {
                    Toast.makeText(LoginActivity.this, "Please input your password", Toast.LENGTH_SHORT).show();
                } else if (userName.getEditText().getText().toString().equals("a") &&
                        password.getEditText().getText().toString().equals("a")) {
                    //Correct user name and password, go to main screen
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Wrong input data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
