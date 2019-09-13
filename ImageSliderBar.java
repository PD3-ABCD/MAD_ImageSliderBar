package com.example.mad_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ImageSliderBar extends AppCompatActivity {

    ViewFlipper v_fliper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider_bar);

        int images[]= {R.drawable.image4,R.drawable.image5,R.drawable.image6};

        v_fliper = findViewById(R.id.v_fliper);

        for(int image:images){
            fliperImages(image);
        }

    }

    public void fliperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setImageResource(image);

        v_fliper.addView(imageView);
        v_fliper.setFlipInterval(3000);
        v_fliper.setAutoStart(true);
        

        //ANIMATION
        v_fliper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fliper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
