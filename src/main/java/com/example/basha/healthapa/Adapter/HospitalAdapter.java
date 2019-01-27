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

import com.example.basha.healthapa.Model.HospitalModel;
import com.example.basha.healthapa.R;

import java.util.ArrayList;

/**
 * Created by basha on 7/20/2018.
 */

public class HospitalAdapter extends ArrayAdapter {

    private static final int REQUEST_CALL = 1;
    ArrayList<HospitalModel> hospitalList = new ArrayList<>();
    Context context;
    Intent callIntent;

    public HospitalAdapter(Context context, ArrayList<HospitalModel> hospitalList) {
        super(context, R.layout.row_hospital, hospitalList);
        this.hospitalList = hospitalList;
        this.context = context;

    }



    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View myView = inflater.inflate(R.layout.row_hospital, null);

        TextView hospitalNameTV = (TextView) myView.findViewById(R.id.hosNameTV);
        TextView hospitalAddressTV = (TextView) myView.findViewById(R.id.hosAddressTV);
        TextView hospitalPhoneTV = (TextView) myView.findViewById(R.id.hosPhoneTV);

        hospitalNameTV.setText(hospitalList.get(position).getHospitalName());
        hospitalAddressTV.setText(hospitalList.get(position).getHospitalAddress());
        hospitalPhoneTV.setText(hospitalList.get(position).getHospitalPhone());

        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder
                        .setMessage("আপনি কি জরুরী কল করতে চান" +
                                hospitalList.get(position).getHospitalName() +" এ" + " ?")
                        .setTitle("কল করতে চান ?")
                        .setCancelable(true)
                        .setPositiveButton("হ্যাঁ",
                                new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface dialog, int id) {
                                        callIntent = new Intent(Intent.ACTION_CALL);
                                        callIntent.setData(Uri.parse("tel:" + hospitalList.get(position).getHospitalPhone()));
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

