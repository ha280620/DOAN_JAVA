package com.example.doan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class form3 extends AppCompatActivity {

    public static  final int CAMERA_REQUEST=100;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

       imageView = findViewById(R.id.capturedImage);
       button =findViewById(R.id.openCamera);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent open_camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivityForResult(open_camera,CAMERA_REQUEST);
           }
       });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CAMERA_REQUEST){

            Bitmap photo = (Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }








    }
}