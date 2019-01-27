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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView healthcard, hospitalcard, doctorcard, emmergencycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        healthcard = (CardView) findViewById(R.id.health_card);
        hospitalcard = (CardView) findViewById(R.id.hospital_card);
        doctorcard = (CardView) findViewById(R.id.doctor_card);
        emmergencycard = (CardView) findViewById(R.id.emmergency_card);

        //Add OnclickListener
        healthcard.setOnClickListener(this);
        hospitalcard.setOnClickListener(this);
        doctorcard.setOnClickListener(this);
        emmergencycard.setOnClickListener(this);

    }

    /*public void oneBt(View view) {

        Intent intent = new Intent(MainActivity.this,HealthActivity.class);
        startActivity(intent);
        
    }*/

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.health_card: i = new Intent(this,HealthActivity.class);startActivity(i);break;
            case R.id.hospital_card: i = new Intent(this,HospitalActivity.class);startActivity(i);break;
            case R.id.doctor_card: i = new Intent(this,DoctorActivity.class);startActivity(i);break;
            case R.id.emmergency_card: i = new Intent(this,EmmergencyActivity.class);startActivity(i);break;

        }
    }
}
