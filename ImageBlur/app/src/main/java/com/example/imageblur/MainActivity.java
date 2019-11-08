package com.example.imageblur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnKamera;
    ImageView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnKamera = (Button) findViewById(R.id.btnKamera);

        btnKamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(inten,0);
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode,Intent data){

        super.onActivityResult(requestCode,resultCode,data);
        Bitmap bitmap=(Bitmap)data.getExtras().get("data");
        imageView.
    }
}
