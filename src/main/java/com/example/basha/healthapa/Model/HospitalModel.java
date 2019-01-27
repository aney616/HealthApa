package com.example.basha.healthapa.Model;

/**
 * Created by basha on 7/20/2018.
 */

public class HospitalModel {

    private String hospitalName;
    private String hospitalAddress;
    private String hospitalPhone;

    public HospitalModel(String hospitalName, String hospitalAddress, String hospitalPhone) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhone = hospitalPhone;
    }



    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }
}


