package com.example.basha.healthapa.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.basha.healthapa.Model.DoctorModel;
import com.example.basha.healthapa.R;

import java.util.ArrayList;

/**
 * Created by basha on 7/20/2018.
 */

    public class DoctorAdapter extends ArrayAdapter {
        private static final int REQUEST_CALL = 1;
        ArrayList<DoctorModel> doctorsList = new ArrayList<>();
        Context context;
        Intent callIntent;

        public DoctorAdapter(Context context, ArrayList<DoctorModel> doctorsList) {
            super(context, R.layout.raw_doctor, doctorsList);
            this.doctorsList = doctorsList;
            this.context = context;
        }

        @NonNull
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

        /*TODO: most of the things here are similar to SymptomAdapter*/
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View myView = inflater.inflate(R.layout.raw_doctor, null);

            TextView doctorNameTV = (TextView) myView.findViewById(R.id.docNameTV);
            TextView doctorDesignationTV = (TextView) myView.findViewById(R.id.docDesignationTV);
            TextView doctorAddressTV = (TextView) myView.findViewById(R.id.docAddressTV);
            TextView doctorMeetingTimeTV = (TextView) myView.findViewById(R.id.docMeetingTimeTV);
            TextView doctorPhoneTV = (TextView) myView.findViewById(R.id.docPhoneTV);


            doctorNameTV.setText(doctorsList.get(position).getDoctorName());
            doctorDesignationTV.setText(doctorsList.get(position).getDoctorDesignation());
            doctorAddressTV.setText(doctorsList.get(position).getDoctorAddress());
            doctorMeetingTimeTV.setText(doctorsList.get(position).getDoctorMeetingTime());
            doctorPhoneTV.setText(doctorsList.get(position).getDoctorPhone());
            //symptomTv.setText(symptomList.get(position).getSymptom());
            //dummyTv.setText("Desease No:"+(position+1));

            myView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    alertDialogBuilder
                            .setMessage("আপনি কি " + doctorsList.get(position).getDoctorName() + " কে কল করতে চান?")
                            .setTitle("কল করুন")
                            .setCancelable(true)
                            .setPositiveButton("হ্যাঁ",
                                    new DialogInterface.OnClickListener() {

                                        public void onClick(DialogInterface dialog, int id) {
                                            callIntent = new Intent(Intent.ACTION_CALL);
                                            callIntent.setData(Uri.parse("tel:" + doctorsList.get(position).getDoctorPhone()));
                                            if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                ActivityCompat.requestPermissions((Activity) context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                            } else {
                                                context.startActivity(callIntent);
                                            }
                                        }
                                    });

                    alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            //finish();
                        }
                    });
                    AlertDialog alert = alertDialogBuilder.create();
                    alert.show();
                }
            });

            return myView;
        }

    }


