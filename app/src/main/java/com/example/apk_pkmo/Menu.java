package com.example.apk_pkmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void form_pengajuan(View view) {
        Intent intent = new Intent(Menu.this, Form_Pengajuan.class);
        startActivity(intent);
    }
    public void upload_proposal(View view) {
        Intent intent = new Intent(Menu.this, Upload_Proposal.class);
        startActivity(intent);
    }
    public void panduan(View view) {
        Intent intent = new Intent(Menu.this, Panduan.class);
        startActivity(intent);
    }
    public void gd_template(View view) {
        Intent intent = new Intent(Menu.this, GD_Template.class);
        startActivity(intent);
    }
}