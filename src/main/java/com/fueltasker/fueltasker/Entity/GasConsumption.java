package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GasConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gcID;
    private String date;
    private double odometer;
    private double fuelvolume;
    private double fuelunitprice;
    private String notes;
    public GasConsumption() {super();
    }
    public GasConsumption(int gcID, String date, double odometer, double fuelvolume, double fuelunitprice,
            String notes) {
        this.gcID = gcID;
        this.date = date;
        this.odometer = odometer;
        this.fuelvolume = fuelvolume;
        this.fuelunitprice = fuelunitprice;
        this.notes = notes;
    }
    public int getGcID() {
        return gcID;
    }
    public void setGcID(int gcID) {
        this.gcID = gcID;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getOdometer() {
        return odometer;
    }
    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }
    public double getFuelvolume() {
        return fuelvolume;
    }
    public void setFuelvolume(double fuelvolume) {
        this.fuelvolume = fuelvolume;
    }
    public double getFuelunitprice() {
        return fuelunitprice;
    }
    public void setFuelunitprice(double fuelunitprice) {
        this.fuelunitprice = fuelunitprice;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    

    

}
