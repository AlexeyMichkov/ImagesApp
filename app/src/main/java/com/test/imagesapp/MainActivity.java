package com.test.imagesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imageView = new ImageView(this);
        // применяем ресурс
        imageView.setImageResource(R.drawable.panda);
        //setContentView(R.layout.activity_main);
        setContentView(imageView);
    }
}