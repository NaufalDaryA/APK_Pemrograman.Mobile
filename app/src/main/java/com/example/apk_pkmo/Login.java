package com.example.apk_pkmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    String username="201810130311112";

    String password="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtPass = findViewById(R.id.txtPass);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonRegist = findViewById(R.id.buttonRegist);


        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if(txtUser.getText().toString().equalsIgnoreCase(username)&& txtPass.getText().toString().equalsIgnoreCase(password)) {

                    startActivity(new Intent(Login.this,Menu.class));

                } else {

                    Toast.makeText(Login.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();

                }

            }

        });
        buttonRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    startActivity(new Intent(Login.this, Register.class));
                }
            }
        });
    }
}