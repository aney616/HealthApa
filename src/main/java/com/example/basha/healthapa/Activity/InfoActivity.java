package com.example.basha.healthapa.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapLabel;
import com.example.basha.healthapa.R;
import com.example.basha.healthapa.Util.Constants;

public class InfoActivity extends AppCompatActivity {

    BootstrapButton doctorBtn;
    String stringFromAnotherActivity, stringDesease;
    int DNO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        BootstrapLabel testTV = (BootstrapLabel) findViewById(R.id.testText);
        doctorBtn = (BootstrapButton) findViewById(R.id.seeDoctorBtn);
        BootstrapLabel deseaseName = (BootstrapLabel) findViewById(R.id.testTextDesease);


        Intent testIntent = getIntent();
        stringFromAnotherActivity = testIntent.getExtras().getString("eitaData"); //<-- getting extradata from intent
        stringDesease = testIntent.getExtras().getString("desease");
        DNO = testIntent.getIntExtra("D_NO", 0);

        testTV.setText(stringFromAnotherActivity);
        deseaseName.setText(stringDesease);
    }

    //todo:
    public void onClickSeeDoctor(View view) {

        if (DNO == Constants.CHILD_MAL_NUTRITION) {
            //TODO: TO doctor list
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_MAL_NUTRITION);
            startActivity(intent);
        } else if (DNO == Constants.CHILD_DENGUE) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_DENGUE);
            startActivity(intent);
        } else if (DNO == Constants.CHILD_PNEUMONIA) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_PNEUMONIA);
            startActivity(intent);
        } else if (DNO == Constants.CHILD_MALARIA) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_MALARIA);
            startActivity(intent);
        } else if (DNO == Constants.CHILD_DIAHOREA) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_DIAHOREA);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no1) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no1);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no2) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no2);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no3) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no3);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no4) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no4);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no5) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no5);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no6) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no6);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no7) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no7);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no8) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no8);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no9) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no9);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no10) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no10);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no11) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no11);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no12) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no12);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no13) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no13);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no14) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no14);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no15) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no15);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no16) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no16);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no17) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no17);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no18) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no18);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no19) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no19);
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no20) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no20);
            
            startActivity(intent);
        } else if (DNO == Constants.FEMALE_DESEASES_no21) {
            Intent intent = new Intent(InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.FEMALE_DESEASES_no21);
            startActivity(intent);
        }
    }
}
