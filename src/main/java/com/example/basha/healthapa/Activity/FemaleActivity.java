package com.example.basha.healthapa.Activity;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.example.basha.healthapa.Adapter.FemaleSymptomAdapter;
import com.example.basha.healthapa.Adapter.SymptomManager;
import com.example.basha.healthapa.Model.Symptom;
import com.example.basha.healthapa.R;

import java.util.ArrayList;

public class FemaleActivity extends AppCompatActivity {

    private ListView female_diseaseLV;
    private ArrayList<Symptom> symptomList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_female);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        female_diseaseLV =(ListView) findViewById(R.id.female_diseaseLV);
        SymptomManager manager = new SymptomManager();
        symptomList = manager.femaleSymptomLists();


        FemaleSymptomAdapter myAdapter = new FemaleSymptomAdapter(this,symptomList);
        female_diseaseLV.setAdapter(myAdapter);
    }
}
