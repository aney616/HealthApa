package com.example.basha.healthapa.Adapter;

import com.example.basha.healthapa.Model.HospitalModel;

import java.util.ArrayList;

/**
 * Created by basha on 7/20/2018.
 */

public class HospitalManager {

    HospitalModel aHospital = new HospitalModel("চট্টগ্রাম মেডিকেল কলেজ"," ৫৭, কে.বি. ফজলুল কাদের রোড, পাঁচলাইশ থানা","ফোন: ০৩১-৬১৯৫৯৭");
    HospitalModel bHospital = new HospitalModel("চট্টগ্রাম জেনারেল হাসপাতাল","আন্দরকিল্লা রোড, চট্টগ্রাম","ফোন: ০৩১-২২৪৬৩৪");
    HospitalModel cHospital = new HospitalModel("মেমন মাতৃসদন হাসপাতাল","সদরঘাট রোড, চট্টগ্রাম","ফোন:  ০৩১-৬১৭১৬৯");
    HospitalModel dHospital = new HospitalModel("জেমসন রেড ক্রিসেন্ট মাতৃসদন হাসপাতাল","কাটা পাহাড় লাইন, আন্দরকিল্লা, চট্টগ্রাম","ফোন: ০৩১-৬৩৯৫৪০");
    HospitalModel eHospital = new HospitalModel("লায়ন্স জেনারেল হাসপাতাল","জাকির হোসেন রোড, নাসিরাবাদ,চট্টগ্রাম","ফোন: ০৩১-৬২২৪৪৩");
    HospitalModel fHospital = new HospitalModel("হালিশহর জেনারেল হাসপাতাল","আগ্রাবাদ এক্সেস রোড, চট্টগ্রাম ","ফোন: ০৩১-৭১৫১৬৬");
    HospitalModel gHospital = new HospitalModel("চট্টগ্রাম মেট্রোপলিটন হাসপাতাল লিমিটেড","ও. আর. নিজাম রোড, চট্টগ্রাম ","ফোন: ০৩১-৬৫১২৪২");
    HospitalModel hHospital = new HospitalModel("রয়েল হসপিটাল (প্রাঃ) লিমিটেড","ও. আর. নিজাম রোড, চট্টগ্রাম ","ফোন: ০৩১-৬৫৮৮৪২");
    HospitalModel iHospital = new HospitalModel("আল আমিন হাসপাতালে (প্রা।) লিমিটেড","জাকির হোসেন রোড, চট্টগ্রাম ","ফোন: 01819-৬৩৭২২৯");
    HospitalModel jHospital = new HospitalModel("একুশে হাসপাতাল প্রাঃ লিমিটেড","সুগন্ধা রোড নং ২, চট্টগ্রাম ","ফোন: ০৩১-৬৫৭৬২৯");
    HospitalModel kHospital = new HospitalModel("ন্যাশনাল হাসপাতাল প্রাঃ লিমিটেড","মেহেদীবাগ রোড, চট্টগ্রাম ","ফোন: ০৩১-৬২৩৭১৩");
    HospitalModel lHospital = new HospitalModel("ম্যাক্স হাসপাতাল ও ডায়াগনস্টিক সেন্টার লিমিটেড","মরহুম আলহাজ জহুর আহম্মেদ চৌধুরী সড়ক, চট্টগ্রাম ","ফোন: ০৩১-৬২২৫১৯");


    public ArrayList<HospitalModel> getAllHospitals() {
        ArrayList<HospitalModel> hospitals = new ArrayList<>();

        hospitals.add(aHospital);
        hospitals.add(bHospital);
        hospitals.add(cHospital);
        hospitals.add(dHospital);
        hospitals.add(eHospital);
        hospitals.add(fHospital);
        hospitals.add(gHospital);
        hospitals.add(hHospital);
        hospitals.add(iHospital);
        hospitals.add(jHospital);
        hospitals.add(kHospital);
        hospitals.add(lHospital);
        return hospitals;
    }
}
