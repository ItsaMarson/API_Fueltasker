package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class MaintenanceExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meID;
    
    private String title;
    private double price;
    private String date;

    
    
    public MaintenanceExpenses() {super();
    }
    public MaintenanceExpenses(int meID, String title, double price, String date) {
        this.meID = meID;
        this.title = title;
        this.price = price;
        this.date = date;
    }
    public int getMeID() {
        return meID;
    }
    public void setMeID(int meID) {
        this.meID = meID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
