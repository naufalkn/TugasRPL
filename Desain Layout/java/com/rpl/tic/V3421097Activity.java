package com.rpl.tic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class V3421097Activity extends AppCompatActivity {
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back = (TextView) findViewById(R.id.backtodashboard);

        back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    back.setBackgroundTintList(AppCompatResources.getColorStateList(back.getContext(),R.color.grey));
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    back.setBackgroundTintList(AppCompatResources.getColorStateList(back.getContext(),R.color.white));
                }
                return false;
            }
        });


    }
}