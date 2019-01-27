package com.example.basha.healthapa.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.Toast;

import com.example.basha.healthapa.Adapter.DoctorAdapter;
import com.example.basha.healthapa.Adapter.DoctorManager;
import com.example.basha.healthapa.Model.DoctorModel;
import com.example.basha.healthapa.R;
import com.example.basha.healthapa.Util.Constants;

import java.util.ArrayList;

import static com.example.basha.healthapa.R.drawable.doctors;

public class DoctorActivity extends AppCompatActivity {

    int docTypeInt;
    ListView doctorListView;
    ArrayList<DoctorModel> doctors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_doctor);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        Intent docIntent = getIntent();
        docTypeInt = docIntent.getIntExtra("doctorType", 0);

        doctorListView =  (ListView) findViewById(R.id.doctorListDeseaseWise);
        DoctorManager manager = new DoctorManager();

        if(docTypeInt== Constants.CHILD_DENGUE){
            //gets dengue doctor
            doctors = manager.getChildDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_PNEUMONIA){
            //different doctor এতlist
            doctors = manager.getChildDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_MAL_NUTRITION){
            //different doctor list
            doctors = manager.getChildDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_DIAHOREA){
            //different doctor list
            doctors = manager.getChildDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_MALARIA){
            //different doctor list
            doctors = manager.getChildDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no1){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no2){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no3){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no4){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no5){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no6){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();

            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no7){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no8){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no9){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no10){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no11){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            Toast.makeText(this, "doctypeInt: "+docTypeInt+" Const: "+Constants.FEMALE_DESEASES_no5, Toast.LENGTH_SHORT).show();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no12){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no13){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no14){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no15){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no16){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no17){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no18){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no19){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no20){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.FEMALE_DESEASES_no21){
            //different doctor list
            doctors = manager.getFemaleDiseasesDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else{
            //gets all doctor if doctor clicked from main activity
            doctors = manager.getAllDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }
        //TODO: bind doctor custom list adapter as doctor type ---- using doctor model
    }
}

