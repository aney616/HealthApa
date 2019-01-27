package com.example.basha.healthapa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
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

/**
 * Created by basha on 4/23/2018.
 */

public class FemaleSymptomAdapter extends ArrayAdapter {

    private ArrayList<Symptom> symptomList = new ArrayList<>();
    private Context context;
    private CardView deseaseCard;

    public FemaleSymptomAdapter(Context context, ArrayList<Symptom> symptomList) {
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
        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position == 0){ // <-- If 1st list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","ঋতুস্রাবের সময় অতিরিক্ত রক্তপাত");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no1);
                    context.startActivity(intent);
                }else if(position == 1){   // <-- If 2nd list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","ঋতুস্রাবের সময় ব্যাথা হওয়া");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no2);
                    context.startActivity(intent);
                }else if(position == 2){  // <-- If 3rd list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom() );  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","ঋতুস্রাব না হওয়া");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no3);
                    context.startActivity(intent);
                }else if(position == 3){  // <-- If 4th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","সাদাস্রাব যাওয়া");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no4);
                    context.startActivity(intent);
                }else if(position == 4){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","যে কোনো কারণে রক্তপাত হওয়া)");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no5);
                    context.startActivity(intent);
                }else if(position == 5){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","জরায়ুর মুখে ক্যান্সার");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no6);
                    context.startActivity(intent);
                }else if(position == 6){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","স্ত্রীযোনীর মুখ দিয়ে কোন ফিমেল অঙ্গ বের হওয়া)");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no7);
                    context.startActivity(intent);
                }else if(position == 7){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","প্রস্রাবের থলি আর স্ত্রীযোনীর ছিদ্র হয়ে যাওয়া, ফলে প্রস্রাব যোনীতে চলে আসা)");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no8);
                    context.startActivity(intent);
                }else if(position == 8){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","ডিম্বাশয়ে টিউমার");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no9);
                    context.startActivity(intent);
                }else if(position == 9){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","জরায়ুতে টিউমার");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no10);
                    context.startActivity(intent);
                }else if(position == 10){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","যোনীদেশে ইনফেকশন হওয়া");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no11);
                    context.startActivity(intent);
                }else if(position == 11){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","গর্ভপাত");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no12);
                    context.startActivity(intent);
                }else if(position == 12){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","জরায়ুর বাইরে বাচ্চা");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no13);
                    context.startActivity(intent);
                }else if(position == 13){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","এক ধরনের টিউমার যা দেখতে আঙ্গুরের মত কিন্তু কোন বাচ্চা থাকে না");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no14);
                    context.startActivity(intent);
                }else if(position == 14){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","গর্ভকালীন সময়ে জরায়ুর মুখ দিয়ে রক্তপাত");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no15);
                    context.startActivity(intent);
                }else if(position == 15){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","ডেলিভারির পর ডেলিভারি রিলেটেড জটিলতায় জরায়ুর মুখ দিয়ে রক্তপাত");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no16);
                    context.startActivity(intent);
                }else if(position == 16){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","সময়ের আগে পানি ভেঙ্গে যাওয়া");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no17);
                    context.startActivity(intent);
                }else if(position == 17){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","গর্ভকালীন সময়ে হাতে পায়ে পানি আসা সেই সাথে হাই প্রেসার");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no18);
                    context.startActivity(intent);
                }else if(position == 18){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","গর্ভকালীন খিঁচুনি");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no19);
                    context.startActivity(intent);
                }else if(position == 19){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","ক্ষতস্থান ইনফেকশন");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no20);
                    context.startActivity(intent);
                }else if(position == 20){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","বন্ধ্যাত্ব");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no21);
                    context.startActivity(intent);
                }


            }
        });

        return myView;
    }
}
