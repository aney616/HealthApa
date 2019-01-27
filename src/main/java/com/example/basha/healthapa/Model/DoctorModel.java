package com.example.basha.healthapa.Model;

/**
 * Created by basha on 7/20/2018.
 */

public class DoctorModel {
    private int id;
    private String doctorName;
    private String doctorDesignation;
    private String doctorAddress;
    private String doctorPhone;
    private String doctorMeetingTime;

    public DoctorModel() {
    }

    public DoctorModel(String doctorName, String doctorDesignation, String doctorAddress, String doctorMeetingTime, String doctorPhone) {
        this.doctorName = doctorName;
        this.doctorDesignation = doctorDesignation;
        this.doctorAddress = doctorAddress;
        this.doctorMeetingTime = doctorMeetingTime;
        this.doctorPhone = doctorPhone;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorDesignation() {
        return doctorDesignation;
    }

    public void setDoctorDesignation(String doctorDesignation) {
        this.doctorDesignation = doctorDesignation;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorMeetingTime() {
        return doctorMeetingTime;
    }

    public void setDoctorMeetingTime(String doctorMeetingTime) {
        this.doctorMeetingTime = doctorMeetingTime;
    }
}


