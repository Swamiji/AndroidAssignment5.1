package com.example.amitroy.blinkinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView txtMessage;
     Button btnStart;
    Animation blink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        btnStart=(Button)findViewById(R.id.btnStart);
        blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.GONE);
                txtMessage.startAnimation(blink);
            }
        });
        blink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
