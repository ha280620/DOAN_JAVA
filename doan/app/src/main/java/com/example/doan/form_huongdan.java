package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class form_huongdan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_huongdan);


    }


    public void ketqua(View view) {

        Toast.makeText(getApplicationContext(), "    Loading............", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(form_huongdan.this, form_huongdan1.class);
                startActivity(intent);
            }
        }, 3000);
    }
}