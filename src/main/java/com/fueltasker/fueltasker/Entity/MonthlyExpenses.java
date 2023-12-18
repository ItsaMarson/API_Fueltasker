package com.fueltasker.fueltasker.Entity;

import java.util.List;
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

    private MonthlyExpenses(){super();}

    public double getTotalpricecarwash() {
        return totalpricecarwash;
    }

    public void setTotalpricecarwash(List<CarwashExpenses> carwashExpensesList) {
        double total = 0.0;

        for (CarwashExpenses carwashExpenses : carwashExpensesList) {
            total += carwashExpenses.getPrice();
        }

        this.totalpricecarwash = total;
    }
}
