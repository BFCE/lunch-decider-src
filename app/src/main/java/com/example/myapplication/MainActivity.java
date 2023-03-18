package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ezanas();
//            }
//        });
    }
    public void filtersButton_Click(View view) {
        Snackbar.make(findViewById(android.R.id.content), "Feature not yet implemented",
                        Snackbar.LENGTH_SHORT)
                .show();

    }

    public void spin(View view) {
    startSpin();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                stopSpin();
            }
        }, 2000);
    }
    public void startSpin() {
        ImageView refreshImage = (ImageView) this.findViewById(R.id.imageView2);
        refreshImage.setImageDrawable(getResources().getDrawable(R.drawable.placeholder_wheel));
        Animation rotateLoading = AnimationUtils.loadAnimation(this, R.anim.rotate);
        refreshImage.clearAnimation();
        refreshImage.setAnimation(rotateLoading);
    }
    public void stopSpin() {
        ImageView refreshImage = (ImageView) this.findViewById(R.id.imageView2);
        if(refreshImage.getAnimation() != null) {
            refreshImage.clearAnimation();
            refreshImage.setImageDrawable(getResources().getDrawable(R.drawable.placeholder_wheel));

        }
    }
}