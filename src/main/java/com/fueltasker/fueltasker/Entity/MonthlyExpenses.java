package com.fueltasker.fueltasker.Entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MonthlyExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meID;

    private double totalpricecarwash;
    private double totalmaintenanceexpenses;
    private double totalCustomizationExpenses;
    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private Users users;

    private MonthlyExpenses(){super();}

    public double getTotalpricecarwash() {
        return totalpricecarwash;
    }
    public double getTotalmaintenanceexpenses() {
        return totalmaintenanceexpenses;
    }
    public double getTotalCustomizationExpenses() {
        return totalCustomizationExpenses;
    }

    public void setTotalpricecarwash(List<CarwashExpenses> carwashExpensesList) {
        double total = 0.00;

        for (CarwashExpenses carwashExpenses : carwashExpensesList) {
            total += carwashExpenses.getPrice();
        }

        this.totalpricecarwash = total;
    }

    public void setTotalMaintenanceExpenses(List<MaintenanceExpenses> maintenanceExpenses){
        double total = 0.00;

        for(MaintenanceExpenses maintenanceExpenses2 : maintenanceExpenses){
            total += maintenanceExpenses2.getPrice();        
        }
        this.totalmaintenanceexpenses = total;
    }

    public void setTotalCustomizationExpenses(List<CustomizationExpenses> customizationExpenses){
        double total = 0.00;

        for(CustomizationExpenses customizationExpenses2 : customizationExpenses){
            total += customizationExpenses2.getPrice();        
        }
        this.totalCustomizationExpenses = total;
    }

    
}
