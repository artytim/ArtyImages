package com.example.android.userinterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.foodImage);
        Picasso.with(this).load(R.drawable.apple_pie).into(imageView);
    }

    public void clickHandler(View view) {
        String imageName = "file:///android_asset/artichokes.jpg";
//        Picasso.with(this).load(imageName).into(imageView);
        Picasso.with(this).load(imageName).fit().into(imageView);
    }
}
