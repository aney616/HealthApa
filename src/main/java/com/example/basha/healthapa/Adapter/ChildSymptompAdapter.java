package com.example.basha.healthapa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basha.healthapa.Activity.InfoActivity;
import com.example.basha.healthapa.Model.Symptom;
import com.example.basha.healthapa.R;
import com.example.basha.healthapa.Util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basha on 4/23/2018.
 */

public class ChildSymptompAdapter extends ArrayAdapter {
    private ArrayList<Symptom> symptomList = new ArrayList<>();
    private Context context;


    public ChildSymptompAdapter(Context context, ArrayList<Symptom> symptomList) {
        super(context, R.layout.row_disease, symptomList);
        this.symptomList = symptomList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View myView = inflater.inflate(R.layout.row_disease, null);

        final TextView symptomTv = (TextView) myView.findViewById(R.id.deseaseListItemTv);
        TextView dummyTv = (TextView) myView.findViewById(R.id.dummyText);

        symptomTv.setText(symptomList.get(position).getSymptom());
        dummyTv.setText("লক্ষণ নং:" + (position + 1));

        //TODO: Setting listener for Listview Item --- List view te kono item e click korle ki hobe seta set kora
        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) { // <-- If 1st list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "অপুষ্টি জনিত সমস্যা");
                    intent.putExtra("D_NO", Constants.CHILD_MAL_NUTRITION);
                    context.startActivity(intent);
                } else if (position == 1) {   // <-- If 2nd list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "নিউমোনিয়া");
                    intent.putExtra("D_NO", Constants.CHILD_PNEUMONIA);
                    context.startActivity(intent);
                } else if (position == 2) {  // <-- If 3rd list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "ডেঙ্গু");
                    intent.putExtra("D_NO", Constants.CHILD_DENGUE);
                    context.startActivity(intent);
                } else if (position == 3) {  // <-- If 4th list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "ম্যালেরিয়া");
                    intent.putExtra("D_NO", Constants.CHILD_MALARIA);
                    context.startActivity(intent);
                } else if (position == 4) {  // <-- If 4th list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "ডায়রিয়া");
                    intent.putExtra("D_NO", Constants.CHILD_DIAHOREA);
                    context.startActivity(intent);
                }

            }

        });
        return myView;
    }
}
