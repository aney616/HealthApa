package com.example.basha.healthapa.Adapter;

import com.example.basha.healthapa.Model.Symptom;

import java.util.ArrayList;

/**
 * Created by basha on 4/22/2018.
 */

public class SymptomManager {

    Symptom aSymptom = new Symptom("অতিরিক্ত ওজন কমে যাওয়া,\nবুকের হাড় দেখা যাওয়া,\nকোমড় বুক আর পেটের চেয়ে ছোট হওয়া,\n" +
            "দুই পা ফুলে যাওয়া,\nপায়ে পানি চলে আসা,\nহাতের তালু ফ্যাকাশে হয়ে যাওয়া,\nবয়সের তুলনায় ওজন অনেক কম হওয়া");
    Symptom bSymptom = new Symptom("বাচ্চা বুকের দুধ খেতে পারছেনা,\n জোরে জোরে নিঃশ্বাস নিচ্ছে ,\n নিঃশ্বাস নেওয়ার সময় বুক আর পেটের একটা অংশ ঢেবে যাচ্ছে, \n " +
            "বাচ্চার বুকে ঘড়ঘড় শব্দ হচ্ছে ,\nযা খাচ্ছে বমি করে ফেলছে ,\n খিঁচুনি ,\n  নাক দিয়ে পানি পড়া ,কাশি \n");
    Symptom cSymptom = new Symptom("জ্বর ৯৯ ডিগ্রি ফারেনহাইটের বেশি থাকা \n");
    Symptom dSymptom = new Symptom("অনেক বেশি জ্বর ১০১/১০২ এর উপরে\n গিঁটে  গিঁটে  ব্যথা \n");
    Symptom eSymptom = new Symptom("পাতলা পায়খানা ,\nচোখ ঢেবে যাওয়া আর গর্তে বসে যাওয়া");


    public ArrayList<Symptom> childSymptomLists(){
        ArrayList<Symptom> symptomList = new ArrayList<Symptom>();
        symptomList.add(aSymptom);
        symptomList.add(bSymptom);
        symptomList.add(cSymptom);
        symptomList.add(dSymptom);
        symptomList.add(eSymptom);
        return symptomList;
    }

    Symptom fSymptom = new Symptom("প্রতি ঘন্টায় এক বা একের অধিক প্যাড বা কাপড় পরিবর্তন করার প্রয়োজন হয়।\n" +
            "এক সপ্তাহের বেশী রক্ত যাবে।\n" +
            "চাকা চাকা রক্ত যাবে।\n" +
            "রাতে ঘুম থেকে উঠে স্যানিটারী প্যাড পরিবর্তন করার প্রয়োজন হয়।\n" +
            "রক্তশূণ্যতার কিছু লক্ষন যেমন- ক্লান্তি, দূর্বলতা, ও শ্বাস ও নিতে কষ্ট হয়।\n");
    Symptom gSymptom = new Symptom("মাসিকের সময় পেটে অতিরিক্ত ব্যাথা\n" +
            "\tপেটে চাপ অনুভূক্ত হয়।\t \n" +
            "\tএ সময় কোমর এবং উরুতেও ব্যাথা অনুভূত হয়।\n");
    Symptom hSymptom = new Symptom("মাসিক বন্ধ থাকা\n" +
            "\tভুলবশত পিল না খাওয়া হিস্ট্রি থাকবে।\n" +
            "\tদুধের বোঁটা দিয়ে দুধ জাতীয় কিছু নিঃসরন হওয়া\n" +
            "\tচুল পড়ে যায় মাথা ব্যাথ্যা ও ব্রণ ওঠা\n" +
            "\tকোমর ব্যাথ্যা\n");
    Symptom iSymptom = new Symptom("মাসিকের রাস্তায় দিয়ে সাদা জাতীয় পরিস্কার স্রাব নিঃসরন হয়।\n" +
            "\tমাসিকের রাস্তায় স্রাব যাওয়া স্বাভাবিক প্রক্রিয়া\n");
    Symptom jSymptom = new Symptom("অনিয়মিত যোনিপথে রক্তক্ষরণ (২১ দি ন পর পর অথবা ৩৫ দিন পর পর)\n" +
            " \tযোনিপথে রক্তক্ষরণ ৭ দিনের বেশি থাকা।\n");
    Symptom kSymptom = new Symptom("যোনিপথে রক্তক্ষরণ যখন স্বাভাবিক নয় যেমন মাসিক না হয়ে ও সহকামের পর \tঅথবা স্থায়ী ভাবে মাসিক বন্ধের পরও রক্তক্ষরণ।\n" +
            "\tতলপেটে অথবা কোসের ব্যাথা অনুভূত।\n" +
            "সহবাসের সময় ব্যাথা অনুভূত।\n" +
            "মাসিরকের রাস্তায় অস্বভাবিক স্রাব যাওয়া (যেমন : দুর্গন্ধযুক্ত  স্রাব/ ময়লাযুক্ত স্রাব \tলালচে স্রাব\n  ");
    Symptom lSymptom = new Symptom("মাসিকের রাস্তা দিয়ে মাংসপিন্ড বের হয়ে আসা।\n" +
            "\tমাসিকের রাস্তা দিয়ে অস্বভাবিক স্রাব যাওয়া।\n" +
            "\tসহবাসে সমস্যার সম্মুখীন হওয়া।\n");
    Symptom mSymptom = new Symptom("মাসিকের রাস্তা দিয়ে অনবরত অথবা ফোঁটায় ফোঁটায় প্র স্রাব নির্গমন। ফলে কাপড় \tভিজে যায় যা থেকে প্র স্রাবের গন্ধ পাওয়া যায়।\n" +
            "অনেকক্ষেত্রে প্র স্রাবের বেগ অনুপস্থিত থাকে।\n" +
            "মাসিকের রাস্তায় এবং তার আশে পাশে চুলকায় এবং তার ফলে ক্ষত সৃষ্টি হয়।\n");
    Symptom nSymptom = new Symptom("তলপেটে টিউমার বা চাকা চাকা অনুভূত হওয়া কিংবা তলপেটে ভারী অনুভূত হওয়া।\n" +
            "\tতলপেটে ব্যাথ্যা অনেকক্ষেত্রে কোমর উরুতে ব্যাথ্যা থাকে।\n" +
            "\tপেটে পানি আসা\n" +
            "\tহঠাৎ বেশী ওজন কমে যাওয়া।\n");
    Symptom oSymptom = new Symptom("মাসিকের সময় অতিরিক্ত রক্তক্ষরণ\n" +
            "\tএবং সপ্তাহের বেশী সময় ধরে মাসিক হওয়া।\n" +
            "\tতলপেটে টিউমার বা চাকা চাকা অনুভূত হওয়া।\n" +
            "\tবারবার গর্ভপাত হওয়া বন্ধ্যাত্ব");
    Symptom pSymptom = new Symptom("মাসিকের রাস্তা দিয়ে অস্বাভাবিক দুর্গন্ধযুক্ত স্রাব যাওয়া।\n" +
            "\tতলপেট, কোমর এবং উরুতে ব্যাথা।\n" +
            "\tসহবাসের সময় ব্যাথ্যা অনুভূত।\n" +
            "\tজ্বর বা কাঁপুনি দিয়ে জ্বর আসা\n");
    Symptom qSymptom = new Symptom("গর্ভাবস্থার ১ম ৪ মাসের মধ্যে মাসিকের রাস্তা দিয়ে রক্তক্ষরণ , তলপেটে প্রচন্ড ব্যথা।\n" +
            "\tকিছু ক্ষেত্রে মাসিকের রাস্তা দিয়ে মাংসপিন্ড নির্গমন।\n");
    Symptom rSymptom = new Symptom("৬-৯ সপ্তাহের মত মাসিক বন্ধ থাকবে।\n" +
            "\tকিছুক্ষেত্রে খুব বেশি ব্যাথা থাকে এবং কিছু ক্ষেত্রে ব্যাথা না ও থাকবে পারে।\n" +
            "\tমাসিকের রাস্তা দিয়ে সামান্য পরিমাণে রক্তক্ষরন হতে পারে।\n");
    Symptom sSymptom = new Symptom("৯-১২ সপ্তাহের মত মাসিক বন্ধ থাকবে।\n" +
            "\tআঙ্গুরের থোকার মত মাংসপিন্ড এর গঠন দেখা কাবে মাসিকের রাস্তায়।\n" +
            "\tঅনেক বেশী বমি হবে।\n");
    Symptom tSymptom = new Symptom("গর্ভাবস্থার ২৮ সপ্তাহের পর এবং প্রসব বেদনা ওঠার পূর্বে মাসিকের রাস্তা দিয়ে রক্তক্ষরণ\n" +
            "\tকিছুক্ষেত্রে থাকে না।\n");
    Symptom uSymptom = new Symptom("ডেলিভারীর পর পর অনিয়ন্ত্রিত  রক্তক্ষরণ\n" +
            "\tরক্তচাপ ক্রমে যাবে।\n" +
            "\tপালসের গতি বেড়ে  যায়।\n");
    Symptom vSymptom = new Symptom("মাসিকের রাস্তা দিয়ে অতিরিক্ত স্রাব ( পানির মত) যায়।\n" +
            "\tজ্বর\n" +
            "\tদূর্গন্ধযুক্তস্রাব হতে পারে।\n" +
            "\tপেটে ব্যাথা\n");
    Symptom wSymptom = new Symptom("গর্ভাস্থার ২০ সপ্তাহের পর রক্তাচাপ বেশি অর্থ্যাৎ ১৪০/৯০ মি.মি মার্কারীর উপরে থাকে।\n" +
            "\tঅতিরিক্ত মাথাব্যাথা\n" +
            "\tপায়ে ফোলা আসবে এবং শরীরের ওজন বেড়ে যাবে।\n" +
            "\tচোখের সমস্যা দেখা দিতে পারে।\n" +
            "\tপ্স্রাবের পরিমাণ কমে যাবে।\n");
    Symptom xSymptom = new Symptom("গর্ভকালীন সময়ে রক্তচাপ ১৬০/১০০ মি.মি অফ মার্কারীর উপরে থাকবে।\n" +
            "\tখিঁচুনী অথবা এবং অজ্ঞান হয়ে যেতে পারে।\n");
    Symptom ySymptom = new Symptom("সেলাইয়ের স্থান এবং তার চারপাশি লাল হয়ে ফুলে যাবে।\n" +
            "\tজ্বর থাকবে।\t\n" +
            "\tসেলাইয়ের স্থান থাকে পুঁজ বের হবে।\n");
    Symptom zSymptom = new Symptom("কোন জন্ম নিয়ন্ত্রণ পদ্ধতি ব্যবহার না করে এবং ১ বছর স্বামী সহবাসের পরও যদি গভধারণ করতে না পারে।\n" +
            "\tঅনিয়মিত মাসিক বা মাসিক বন্ধ থাকতে পারে।\n" +
            "\tমাসিকের সময় অতিরিক্ত ব্যাথা এবং রক্তসরণ হতে পারে।\n" +
            "\tহরমোন জনিত রোগ থাকতে পারে।\n");

    public ArrayList<Symptom> femaleSymptomLists(){
        ArrayList<Symptom> symptomList = new ArrayList<Symptom>();
        //todo: female symptop list gula ei khane add korba similar to the previous one.
        symptomList.add(fSymptom);
        symptomList.add(gSymptom);
        symptomList.add(hSymptom);
        symptomList.add(iSymptom);
        symptomList.add(jSymptom);
        symptomList.add(kSymptom);
        symptomList.add(lSymptom);
        symptomList.add(mSymptom);
        symptomList.add(nSymptom);
        symptomList.add(oSymptom);
        symptomList.add(pSymptom);
        symptomList.add(qSymptom);
        symptomList.add(rSymptom);
        symptomList.add(sSymptom);
        symptomList.add(tSymptom);
        symptomList.add(uSymptom);
        symptomList.add(vSymptom);
        symptomList.add(wSymptom);
        symptomList.add(xSymptom);
        symptomList.add(ySymptom);
        symptomList.add(zSymptom);
        return symptomList;

    }
}
