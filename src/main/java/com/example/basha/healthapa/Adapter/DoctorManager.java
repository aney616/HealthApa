package com.example.basha.healthapa.Adapter;

import com.example.basha.healthapa.Model.DoctorModel;

import java.util.ArrayList;

/**
 * Created by basha on 7/20/2018.
 */

public class DoctorManager {

    //DoctorModel dengueDoctor = new DoctorModel();

    /*TODO: for example we will create 10 dengue doctor so we will use a loop to make
    * TODO: demo dengue doctors  Arraylist*/

    public ArrayList<DoctorModel> getDengueDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel dengueDoctor = new DoctorModel();
            dengueDoctor.setDoctorName("Dengue Doctor " + i + " Name");
            dengueDoctor.setDoctorAddress("Dengue Doctor " + i + " Address");
            dengueDoctor.setDoctorDesignation("Dengue Doctor " + i + " Designation");
            dengueDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(dengueDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getNutritionDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel nutritionDoctor = new DoctorModel();
            nutritionDoctor.setDoctorName("Nutrition Doctor " + i + " Name");
            nutritionDoctor.setDoctorAddress("Nutrition Doctor " + i + " Address");
            nutritionDoctor.setDoctorDesignation("Nutrition Doctor " + i + " Designation");
            nutritionDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(nutritionDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getPneumoniaDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel pneumoniaDoctor = new DoctorModel();
            pneumoniaDoctor.setDoctorName("Pneumonia Doctor " + i + " Name");
            pneumoniaDoctor.setDoctorAddress("Pneumonia Doctor " + i + " Address");
            pneumoniaDoctor.setDoctorDesignation("Pneumonia Doctor " + i + " Designation");
            pneumoniaDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(pneumoniaDoctor);

        }
        return doctors;
    }


    DoctorModel adoctor = new DoctorModel("অধ্যাপক (ডা:) মুসলিম উদ্দীন (সবুজ)\nশিশুরোগ বিশেষজ্ঞ", "এমবিবিএস,ডিসিএইচ,এমডি ( শিশু-স্বাস্থ্য) ", "সহযোগি অধ্যাপক , আই আই এম সি এইচ\n" +
            "পিএবিএ• নম্বর - ১৯০, ২য় তলা ", "সাক্ষাতের সময়: প্রতিদিন বিকাল ৫টা - ৯টা\n" +
            "(শুক্রবার বন্ধ) ", " ০১৭৩-১৯২৭২০৯ ");
    DoctorModel bdoctor = new DoctorModel("ডা: নুরুল কাদের সিকদার\nনবজাতক ও শিশুরোগ বিশেষজ্ঞ","এমবিবিএস,ডিসিএইচ,(বিএসএমএমইউ)\n" +
            "এম ডি (থিসিস)\n","চট্টগ্রাম মা ও শিশু হাসপাতাল\n" +
            "পিএবিএ• নম্বর - ২১৭, ২য় তলা\n","সাক্ষাতের সময়: প্রতিদিন সকাল ১১টা - দুপুর ২টা পর্যন্ত\n" +
            "সন্ধ্যা ৬টা - রাত ৯টা, সোমবার ও বৃহস্পতিবার\n" +
            "সন্ধ্যা ৭.৩০টা - রাত ৯.৩০টা\n","০১৯২৬-৮২৫৩৭২");
    DoctorModel cdoctor = new DoctorModel("ডা: মো: আব্দুলাহ আল মামুন\n" +
            "নবজাতক ও শিশুরোগ বিশেষজ্ঞ\n","এমবিবিএস,এফসিপিএস ( শিশু-স্বাস্থ্য)\n","চট্টগ্রাম মা ও শিশু হাসপাতাল\n" +
            "পিএবিএ• নম্বর - ১৪২, ২য় তলা\n","সাক্ষাতের সময়: বিকাল ৫টা - সন্ধ্যা ৭টা"," ");
    DoctorModel ddoctor = new DoctorModel("ডা: কামরুন নেছা রুনা\n" +
            "প্রসূতি ও স্ত্রীরোগ বিশেষজ্ঞ\n","এমবিবিএস ,এম এস, এমসিপিএস, ডি.জি.ও\n" +
            "সিনিয়র কনসালটেন্ট গাইনী\n","চট্টগ্রাম মেডিকেল কলেজ হাসপাতাল\nপিএবিএ• নম্বর - ২০৭, ২য় তলা\n","সাক্ষাতের সময়: প্রতিদিন বিকাল ৫টা - ৯টা" +
            "(শুক্রবার বন্ধ)\n","");
    DoctorModel edoctor = new DoctorModel("ডা: তাজিন সুলতানা\nগাইনী বিশেষজ্ঞ ও সার্জন ","এমবিবিএস ,এফসিপিএস,(গাইনি এন্ড অব্ধসঢ়;স)\n" +
            "কনসালটেন্ট গাইনী\n ","চট্টগ্রাম মেডিকেল কলেজ হাসপাতাল\n" +
            "পিএবিএ• নম্বর - ২৩৩, ২য় তলা\n ","সাক্ষাতের সময়: প্রতিদিন সন্ধ্যা ৬টা - ৯টা\n" +
            "(শুক্রবার বন্ধ) ","০১৭১১-৬৭১৯৯০ ");
    DoctorModel fdoctor = new DoctorModel("ডা: তফিকুর সাহার (মোনা)\n" +
            "গাইনী বিশেষজ্ঞ ও সার্জন","এমবিবিএস, বিসিএস (সাস্থ্য)\n" +
            "এমএস (গাইনি এন্ড অব্স)","চট্টগ্রাম মেডিকেল কলেজ হাসপাতাল\n" +
            "পিএবিএ• নম্বর - ২৫৫, ২য় তলা\n ","সাক্ষাতের সময়: প্রতিদিন সন্ধ্যা ৫টা - ৮.৩০টা\n" +
            "(শুক্রবার বন্ধ) ","০১৮২৩৩১০৭৩৩");
    DoctorModel gdoctor = new DoctorModel("ডা: মুসলিনা আখতার\n" +
            "প্রসূতি ও স্ত্রীরোগ বিশেষজ্ঞ ও সার্জন\n ","এমবিবিএস , এমসিপিএস, এফসিপিএস (অব্স এন্ড গাইনি)\n" +
            "সহকারি অধ্যাপক ও বিভাগীয় প্রধান ","চট্টগ্রাম ইন্টারন্যাশনাল ইসলামিক মেডিকেল কলেজ\n" +
            "পিএবিএ• নম্বর - ১৪৭, ১ম তলা\n ","সাক্ষাতের সময়: রবি থেকে বৃহস্পতিবার\n" +
            "(শুক্রবার শনিবার বন্ধ)\n" +
            "বিকাল ৬.৩০টা - ৯টা\n","০১৮১৭-৪০২৩২২ ");
    DoctorModel hdoctor = new DoctorModel("ডা: সারওয়াত আরা রিকু \n" +
            "প্রসূতি ও স্ত্রীরোগ বিশেষজ্ঞ ও সার্জন\n ","এমবিবিএস, বিসিএস (সাস্থ্য) এমসিপিএস\n" +
            "এমএস (অব্স এন্ড গাইনি)\n ","চট্টগ্রাম মেডিকেল কলেজ হাসপাতাল\n" +
            "পিএবিএ• নম্বর - ১৪৪, ১ম তলা\n ","সাক্ষাতের সময়: প্রতিদিন সন্ধ্যা ৫টা - ৯টা\n" +
            "(শুক্রবার বন্ধ) ","০১৮২৭-২৪৩৭২০");
    DoctorModel idoctor = new DoctorModel("ডা: শামীম আরা বেগম\n" +
            "গাইনী বিশেষজ্ঞ চিকিসৎক\n ","এবিবিএস,ডিজিও (গাইনী এন্ড অব্স)\n" +
            "বিবিএমএইচ,ইউএসটিসি,চট্টগ্রাম\n ","পিএবিএ• নম্বর - ২৭০, ২য় তলা ","সাক্ষাতের সময়:  "," ");
    DoctorModel jdoctor = new DoctorModel("ডা: প্রীতি বড়ুয়া \n" +
            "স্ত্রী রোগ বিশেষজ্ঞ\n ","এমবিবিএস (চ.বি),এম.সি.পি.এস (বাংলাদেশ)\n" +
            "এম.এস.সি; এম.সি.এইচ (লন্ডন)\n ","সিনিয়র কনসালটেন্ট ও সার্জন\n" +
            "মেমন মাতৃসদন হাসপাতাল\n" +
            "চেম্বার : বেলভিউ(২য় তলা), জামালখান,চট্টগ্রাম\n ","সাক্ষাতের সময়: বিকাল ৫টা থেকে রাত ৮টা পর্যন্ত ",
            "ফোন: ৬৩৫০১৮ ");
    DoctorModel kdoctor = new DoctorModel("ডা: রোজী দত্ত (বিশ্বাস) \n" +
            "স্ত্রীরোগ বিশেষজ্ঞ ও সার্জন\n ","এম বি.বি.এস; ডিজিও\n" +
            "চীফ মেডিকেল অফিসার ও সিনিয়র কনসালটেন্ট\n" +
            "রেড ক্রিসেন্ট মাতৃসনদ হাসপাতাল , আন্দরকিল্লা\n ","১৪, জামাল খান রোড়\n" +
            "প্রেসক্লাব সংলগ্ন চট্টগ্রাম\n ","সাক্ষাতের সময়: বিকাল ৪টা হইতে রাত ৯টা\n" +
            "শুক্রবার সকাল১০টা থেকে দুপুর ১টা\n ","ফোন: ০১৭৩১-০২৫৯১৫ ");
    DoctorModel ldoctor = new DoctorModel("ডা: লুৎফুন নেসা খধন\n" +
            " স্ত্রীরোগ প্রসূতি ও বিশেষজ্ঞ\n ","এম বি.বি.এস এম.সি.পি.\n" +
            "এ•- কনসালটেন্ট(গাইনী)\n" +
            "এ•-আর.এম.ও (গাইনী) চট্টগ্রাম জেনারেল হাসপাতাল\n" +
            "এ•-আর . এস. (গাইনী), বি, বি, এম, এইচ, ইউ,এস,টি,সি\n ","চেম্বার: সেনসিভ, ১৪জামালখান রোড়, চট্টগ্রাম ",
            "সাক্ষাতের সময়: সন্ধ্যা: গ্রীস্মকাল:০৬-০৮ টা, শীতকাল:০৫-০৭টা।\n" +
                    "শুক্রবারও শনিবার বন্ধ\n ","ফোন: ৬১৬৯২০" +
            "মোবাইল: ০১৮৩৭-৬০০১১৫\n ");
    DoctorModel mdoctor = new DoctorModel("ডা: অপরূপ কান্তি দাশ\n" +
            " নবজাতক, শিশু ও কিশোর রোগ বিশেষজ্ঞ\n ","এমবিবিএস, বিসিএস (স্বাস্থ্য)\n" +
            "এফসিপিএস ( শিশু -স্বাস্থ্য),কনসালটেন্ট ( শিশু)\n ","চেম্বার: সেনসিভ, ১৪ জামালখান রোড, চট্টগ্রাম। ",
            "সাক্ষাতের সময়: সন্ধ্যা ৬টা - রাত ১০টা (শুক্রবার বন্ধ) ","সিরিয়ালের জন্য:-০১৮৭৩০১৪০১৩ ");
    DoctorModel ndoctor = new DoctorModel("ডা: জিষ্ণু মজুমদার\nনবজাতক, শিশু-কিশোর রোগ বিশেষজ্ঞ ",
            "এমবিবিএস, ডিসিএইচ, সিসিডি \n কনসালটেন্ট, শিশু - স্বাস্থ্য ","চট্টগ্রাম মা-শিশু ও জেনারেল হাসপাতাল\n" +
            "আগ্রাবাদ, চট্টগ্রাম, (এ•)\n" +
            "চেম্বার:সেনসিভ ডায়াগনষ্টিক সেন্টার\n" +
            "১৪,জামালখান রোড, চট্টগ্রাম।\n ","সাক্ষাতের সময়: সকাল৯টা - ১২টা\n" +
            "বিকাল ৪- ৬টা রাত৯টা- ১০.৩০মি.\n" ,
            "সিরিয়ালের জন্য: ০১৮৭৯৮-৯৭৯৪৪৪\n ");
    DoctorModel odoctor = new DoctorModel("ডা মো: বেলায়েত হোসেন ঢালী\n নবজাতক ও শিশু-কিশোর বিশেষজ্ঞ ",
            "এম.বি.বি.এস; বি.সি.এস.(স্বাস্থ্য )\nএম.ডি (শিশুরোগ), কনসালটেন্ট(শিশু স্বাস্থ্য )\n" +
                    "চট্টগ্রাম মেডিকেল কলেজ হাসপাতাল\n ","চেম্বার:শেভরণ ক্লিনিক্যাল ল্যাব , রুম নং -৬১৪\n" +
            "১২/১২ ও আর নিজাম রোড,মক্কা মসজিদ,পাঁচলাইশ ,চট্টগ্রাম\n ","সাক্ষাতের সময়: বিকাল ৫টা- রাত ৮টা(শুক্রবার বন্ধ)\n",
            "সিরিয়ালের জন্য: ০১৯১৯-৮৩৩১২৩\n ");
    DoctorModel pdoctor = new DoctorModel("ডা: মোসাম্মৎ জেবুন্নেছা\n প্রসূতি ও স্ত্রীরোগ বিশেষজ্ঞ ",
            "এফসিপিএস (অব্স এন্ড গাইনি)\n" +
                    "এম,এস (পি.জি .হাসপাতাল)\n" +
                    "বন্ধ্যাত্ব বিষয়ে উচ্চতর প্রশি¶ণ\n" +
                    "( কলকাতা,দিল্লী ও লন্ডন)\nচট্টগ্রাম মেডিকেল কলেজ হাসপাতাল\n ",
            "চেম্বার: শেভরণ ক্লিনিক্যাল ল্যাব , রুম নং -১৪\n" + "১২/১২ ও আর নিজাম রোড, পাঁচলাইশ চট্টগ্রাম\n ",
            "সাক্ষাতের সময়: সন্ধ্যা ৭টা- রাত ৯টা ","সিরিয়ালের জন্য:  ০১৭৫৬-২০৩৭২০ ");
    DoctorModel qdoctor = new DoctorModel("ডা: জাকিয়া আফরোজ\n" +
            " প্রসূতি ও স্ত্রীরোগ  বিশেষজ্ঞ ও সার্জন\n ","এমবিবিএস, বিসিএস(স্বাস্থ্য ), ডিজিও ,এমসিপিএস\n" +
            "এমএস ( অব্স এন্ড গাইনী)\n" +
            "কনসালটেন্ট ( গাইনি)\n ","চেম্বার: শেভরণ ক্লিনিক্যাল ল্যাব , রুম নং -১৪\n" +
            "১২/১২ ও আর নিজাম রোড, পাঁচলাইশ চট্টগ্রাম\n ",
            "সাক্ষাতের সময়: শনি ,সোম,বুধ ও বৃহস্পতিবার\n" +
                    "বেলা ২.০০ টা- ৫টা পর্যন্ত।\n","সিরিয়ালের জন্য: ০১৮৬৭- ১০৫২৬২ ");
    DoctorModel rdoctor = new DoctorModel("ডা: শাহানাজ শরমিন\n" +
            " প্রসুতি ,স্ত্রীরোগ ও বন্ধ্যাত্ব ্ব বিশেষজ্ঞ ও সার্জন\n ","এমবিবিএস, এমসিপিএস,এফসিপিএস,এমএস\n" +
            "সহকারি অধ্যাপক, প্রসূতি ও স্ত্রীরোগ (বিভাগ)\n" +
            "বিবিএমএইচ,ইউএসটিসি,ফয়‘স লেক,চট্টগ্রাম\n ","চেম্বার:শেভরণ ক্লিনিক্যাল ল্যাব ,\n" +
            "রুম নং ৬১৬ (৬ষ্ট তলা) ১২/১২ ও আর নিজাম রোড,\n" +
            "(মক্কা মসজিদের সামনে) পাঁচলাইশ চট্টগ্রাম\n ","সাক্ষাতের সময়: আগে যোগাযোগ করুন ","সিরিয়ালের জন্য: ০১৮৩৬-৬৩৯১৩৯");
    DoctorModel sdoctor = new DoctorModel("ডা: শ্রাবণী বড়ুয়া\nপ্রসুতি ,স্ত্রীরোগ ও বন্ধ্যাত্ব  বিশেষজ্ঞ ও সার্জন ",
            "এমবিবিএস, বিসিএস (স্বাস্থ্য)\n" + "এফসিপিএস (অব্স এন্ড গাইনি)\n" + "কনসালটেন্ট (গাইনি ও অব্ধসঢ়;স )\n ",
            "চেম্বার: শেভরণ ক্লিনিক্যাল ল্যাব ,\n" +
                    "১২/১২ ও আর নিজাম রোড, (মক্কা মসজিদের সামনে) পাঁচলাইশ চট্টগ্রাম\n ","সাক্ষাতের সময়: শনি ,সোম, ও বুধ বিকাল ৫টা -৭টা, \n" +
            "রবি, মঙ্গল ও বৃহস্পতিবার সন্ধ্যা ৬টা –রাত ৯টা।\n ","সিরিয়ালের জন্য: ০১৮৫০-৭৮৫১০৪ ");
    DoctorModel tdoctor = new DoctorModel("ডা: রোকসানা পারভীন\n" +
            "প্রসূতি ও স্ত্রীরোগ চিকিৎসক\n ","এম বি বি এস(গাইনি ) ",
            "শেভরণ ক্লিনিক্যাল ল্যাব ,\n" +
                    "রুম নং ৬২৬ (৬ষ্ট তলা) ১২/১২ ও আর নিজাম রোড,\n" +
                    "(মক্কা মসজিদের সামনে) পাঁচলাইশ চট্টগ্রাম\n ","সাক্ষাতের সময়: সন্ধ্যা ৭টা- রাত ৯টা ",
            "সিরিয়ালের জন্য: ০১৭১৩-৪৮৭৯০৩ ");
    DoctorModel udoctor = new DoctorModel("ডা: লূৎফুন নাহার বেগম ( কলি)\n" +
            "প্রসূতি ও স্ত্রীরোগ চিকিৎসক\n "," এম বি বি এস(গাইনি ও অব্স)\n" +
            "সহযোগী অধ্যাপিকা\n" +
            "চট্টগ্রাম মা ও জেনারেল হাসপাতাল\n ","চেম্বার: শেভরণ ক্লিনিক্যাল ল্যাব ,\n" +
            "১২/১২ ও আর নিজাম রোড, পাঁচলাইশ চট্টগ্রাম\n ","সাক্ষাতের সময়: বিকাল ৩টা-৫টা ","মোবাইল: ০১৫৫৪-৩৩৯৩২০ ");
    DoctorModel vdoctor = new DoctorModel("ডা: দিলসান আরা হাবিব \n" +
            "স্ত্রীরোগ বিশেষজ্ঞ ও সার্জন\n ","এম, বি, বি, এস এম,সিপি,এস, ডি,জি,ও\n" +
            "কনসালটেন্ট(গাইনী)\n চট্টগ্রাম মেডিকেল কলেজ হাসপাতাল ","ট্রিটমেন্ট ডায়াগষ্টিক সেন্টার ","সাক্ষাতের সময়: সন্ধ্যা ৫টা - রাত ৭টা\n" +
            "শুক্রবার বন্ধ\n ","সিরিয়াল: ০১৮১৯-০৬৫৩৬৭ ");
    DoctorModel wdoctor = new DoctorModel("অধ্যাপক ডা: বদরুদোজা\n" +
            "শিশুরোগ বিশেষজ্ঞ\n ","এমবিবিএস,ডিসিএইচ,এফসিফিএস ","চট্টগ্রাম মা ও শিশু জেনারেল হাসপাতাল মেডিকেল কলেজ ",
            "সাক্ষাতের সময়: সন্ধ্যা ৬.০০টা - রাত ৯.০০টা\n" +
                    "শুক্রবার বন্ধ\n ","সিরিয়াল: ০১৮১৯-৫৩৪৩৪৬ ");
    DoctorModel xdoctor = new DoctorModel("ডা: ফাহিম হাসান রেজা \n" +
            "নবজাতক ও শিশুরোগ বিশেষজ্ঞ\n ","এমবিবিএস, ডিসি এইচ ,( বি, এস, এম ,ইউ ) ","চট্টগ্রাম মা ও শিশু জেনারেল হাসপাতাল মেডিকেল কলেজ ",
            "সাক্ষাতের সময়: বিকাল ৪টা - সন্ধ্যা ৬টা ","যোগাযোগ: চাইল্ডকেয়ার(৩য় তলা)\n" +
            "০১৭১১-৩৮৩০৯০\n ");


    public ArrayList<DoctorModel> getAllDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();

        doctors.add(adoctor);
        doctors.add(bdoctor);
        doctors.add(cdoctor);
        doctors.add(ddoctor);
        doctors.add(edoctor);
        doctors.add(fdoctor);
        doctors.add(gdoctor);
        doctors.add(hdoctor);
        doctors.add(idoctor);
        doctors.add(jdoctor);
        doctors.add(kdoctor);
        doctors.add(ldoctor);
        doctors.add(mdoctor);
        doctors.add(ndoctor);
        doctors.add(odoctor);
        doctors.add(pdoctor);
        doctors.add(qdoctor);
        doctors.add(rdoctor);
        doctors.add(sdoctor);
        doctors.add(tdoctor);
        doctors.add(udoctor);
        doctors.add(vdoctor);
        doctors.add(wdoctor);
        doctors.add(xdoctor);


        return doctors;

    }
    public ArrayList<DoctorModel> getChildDiseasesDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();

        doctors.add(adoctor);
        doctors.add(bdoctor);
        doctors.add(cdoctor);
        doctors.add(mdoctor);
        doctors.add(ndoctor);
        doctors.add(odoctor);
        doctors.add(xdoctor);

        return doctors;
    }

    public ArrayList<DoctorModel> getFemaleDiseasesDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();

        doctors.add(ddoctor);
        doctors.add(edoctor);
        doctors.add(fdoctor);
        doctors.add(gdoctor);
        doctors.add(hdoctor);
        doctors.add(idoctor);
        doctors.add(jdoctor);
        doctors.add(kdoctor);
        doctors.add(ldoctor);
        doctors.add(pdoctor);
        doctors.add(qdoctor);
        doctors.add(rdoctor);
        doctors.add(sdoctor);
        doctors.add(tdoctor);
        doctors.add(udoctor);
        doctors.add(vdoctor);
        doctors.add(wdoctor);

        return doctors;
    }

    public ArrayList<DoctorModel> getDiahoreaDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel DiahoreaDoctor = new DoctorModel();
            DiahoreaDoctor.setDoctorName("Diahorea Doctor "+i+" Name");
            DiahoreaDoctor.setDoctorAddress("Diahorea Doctor "+i+" Address");
            DiahoreaDoctor.setDoctorDesignation("Diahorea Doctor "+i+" Designation");
            DiahoreaDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(DiahoreaDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getMalariaDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel MalariaDoctor = new DoctorModel();
            MalariaDoctor.setDoctorName("Malaria Doctor "+i+" Name");
            MalariaDoctor.setDoctorAddress("Malaria Doctor "+i+" Address");
            MalariaDoctor.setDoctorDesignation("Malaria Doctor "+i+" Designation");
            MalariaDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(MalariaDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getFemaleDesaseNoOneDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel FemaleDesaseNoOneDoctor = new DoctorModel();
            FemaleDesaseNoOneDoctor.setDoctorName("DesaseNoOne Doctor " + i + " Name");
            FemaleDesaseNoOneDoctor.setDoctorAddress("DesaseNoOne Doctor " + i + " Address");
            FemaleDesaseNoOneDoctor.setDoctorDesignation("DesaseNoOne Doctor " + i + " Designation");
            FemaleDesaseNoOneDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(FemaleDesaseNoOneDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getFemaleDesaseNoTwoDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel FemaleDesaseNoTwoDoctor = new DoctorModel();
            FemaleDesaseNoTwoDoctor.setDoctorName("DesaseNoTwo Doctor " + i + " Name");
            FemaleDesaseNoTwoDoctor.setDoctorAddress("DesaseNoTwo Doctor " + i + " Address");
            FemaleDesaseNoTwoDoctor.setDoctorDesignation("DesaseNoTwo Doctor " + i + " Designation");
            FemaleDesaseNoTwoDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(FemaleDesaseNoTwoDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getFemaleDesaseNoFourDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel FemaleDesaseNoFourDoctor = new DoctorModel();
            FemaleDesaseNoFourDoctor.setDoctorName("DesaseNoFour Doctor " + i + " Name");
            FemaleDesaseNoFourDoctor.setDoctorAddress("DesaseNoFour Doctor " + i + " Address");
            FemaleDesaseNoFourDoctor.setDoctorDesignation("DesaseNoFour Doctor " + i + " Designation");
            FemaleDesaseNoFourDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(FemaleDesaseNoFourDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getFemaleDesaseNoThreeDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for (int i = 1; i <= 10; i++) {
            DoctorModel FemaleDesaseNoThreeDoctor = new DoctorModel();
            FemaleDesaseNoThreeDoctor.setDoctorName("DesaseNoThree Doctor " + i + " Name");
            FemaleDesaseNoThreeDoctor.setDoctorAddress("DesaseNoThree Doctor " + i + " Address");
            FemaleDesaseNoThreeDoctor.setDoctorDesignation("DesaseNoThree Doctor " + i + " Designation");
            FemaleDesaseNoThreeDoctor.setDoctorPhone("Phone No: " + i + "98765467");

            doctors.add(FemaleDesaseNoThreeDoctor);

        }
        return doctors;
    }




}

