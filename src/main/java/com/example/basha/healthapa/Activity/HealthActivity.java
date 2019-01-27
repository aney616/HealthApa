package com.example.basha.healthapa.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.basha.healthapa.R;

public class HealthActivity extends AppCompatActivity implements View.OnClickListener{



    private CardView womencard, childcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_health);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        womencard = (CardView) findViewById(R.id.women_card);
        childcard = (CardView) findViewById(R.id.child_card);

        //set onclicklistener
       womencard.setOnClickListener(this);
        childcard.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.women_card:
                i = new Intent(this, FemaleActivity.class);
                startActivity(i);
                break;
            case R.id.child_card:
                i = new Intent(this, ChildActivity.class);
                startActivity(i);
                break;
        }

    }
}