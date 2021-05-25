package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class form_huongdan1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_huongdan1);
    }

    public void ngonngu(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan1.this, form_huongdan2.class);
                startActivity(intent);
            }
        }, 2000);
    }
    public void bangchu(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan1.this, form_huongdan3.class);
                startActivity(intent);
            }
        }, 2000);
    }

    public void bangso(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan1.this, form_huongdan4.class);
                startActivity(intent);
            }
        }, 2000);
    }
    //-----------------------------------------------------------
    public void video(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan1.this, form_huongdan5.class);
                startActivity(intent);
            }
        }, 2000);
    }

    //---------------------------------------------------------------
    public void luyentap(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan1.this, form3.class);
                startActivity(intent);
            }
        }, 2000);
    }

    //---------------------------------------------------------------------
    public void thongtin(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan1.this, form_huongdan7.class);
                startActivity(intent);
            }
        }, 2000);
    }

}