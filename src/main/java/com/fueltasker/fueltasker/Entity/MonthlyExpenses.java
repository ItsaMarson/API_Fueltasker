package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MonthlyExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meID;

    private double totalpricecarwash;
    private double totalmaintenanceexpenses;
    private double totalCustomizationExpenses;


    public MonthlyExpenses(){super();}

    

    public MonthlyExpenses(int meID, double totalpricecarwash, double totalmaintenanceexpenses,
            double totalCustomizationExpenses) {
        this.meID = meID;
        this.totalpricecarwash = totalpricecarwash;
        this.totalmaintenanceexpenses = totalmaintenanceexpenses;
        this.totalCustomizationExpenses = totalCustomizationExpenses;
    }



    public double getTotalpricecarwash() {
        return totalpricecarwash;
    }
    public double getTotalmaintenanceexpenses() {
        return totalmaintenanceexpenses;
    }
    public double getTotalCustomizationExpenses() {
        return totalCustomizationExpenses;
    }

    public int getMeID() {
        return meID;
    }

    public void setMeID(int meID) {
        this.meID = meID;
    }

    public void setTotalpricecarwash(double totalpricecarwash) {
        this.totalpricecarwash = totalpricecarwash;
    }

    public void setTotalmaintenanceexpenses(double totalmaintenanceexpenses) {
        this.totalmaintenanceexpenses = totalmaintenanceexpenses;
    }

    public void setTotalCustomizationExpenses(double totalCustomizationExpenses) {
        this.totalCustomizationExpenses = totalCustomizationExpenses;
    }

    

    
}
