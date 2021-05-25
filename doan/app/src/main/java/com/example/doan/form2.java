package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class form2 extends AppCompatActivity {

    EditText edituser;
    EditText editPassword;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);


        edituser = findViewById(R.id.editUser);
        editPassword = findViewById(R.id.editPassword);
        tvShow = findViewById(R.id.textViewShow);
    }
    public int islogin(String u,String p){     // tao ham dang nhap
        if(u.equals("admin")&& p.equals("123")){
            return 1;
        }
        else {
            return -1;
        }
    }

    public void ketqua(View view){
        String user= edituser.getText().toString();
        String password =editPassword.getText().toString();
        if (user.isEmpty() || password.isEmpty() ){
            Toast.makeText(getApplicationContext(),"khong duoc de trong",Toast.LENGTH_LONG).show();
        }
        else{
            if(islogin(user,password)>0){
                Toast.makeText(getApplicationContext(),"login thanh cong",Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent =new Intent(form2.this,form_huongdan.class);
                        startActivity(intent);
                    }
                },2000);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"sai username password",Toast.LENGTH_LONG).show();
            }

        }



    }
}