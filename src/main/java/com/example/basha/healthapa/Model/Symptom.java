package com.example.basha.healthapa.Model;

/**
 * Created by basha on 4/22/2018.
 */

public class Symptom {
    private int id;
    private String symptom;

    public Symptom(int id, String symptom) {
        this.id = id;
        this.symptom = symptom;
    }

    public Symptom(String symptom) {
        this.symptom = symptom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}
