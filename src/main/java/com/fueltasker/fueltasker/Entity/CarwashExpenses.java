package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CarwashExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ceID;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = true)
    private Users users;
    private String title;
    private double price;
    private String date;

    public CarwashExpenses(){super();}

    

    public CarwashExpenses(int ceID, Users users, String title, double price, String date) {
        this.ceID = ceID;
        this.users = users;
        this.title = title;
        this.price = price;
        this.date = date;
    }



    public int getCeID() {
        return ceID;
    }
    public void setCeID(int ceID) {
        this.ceID = ceID;
    }
    public Users getUsers() {
        return users;
    }
    public void setUsers(Users users) {
        this.users = users;
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
