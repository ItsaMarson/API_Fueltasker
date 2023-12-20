package com.fueltasker.fueltasker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.CarwashExpenses;
import com.fueltasker.fueltasker.Entity.MonthlyExpenses;
import com.fueltasker.fueltasker.Repository.MonthlyServiceRepository;

@Service
public class MonthlyExpensesService {
    @Autowired
    MonthlyServiceRepository monthlyrep;

    @Autowired
    CarwashExpensesService carwashExpensesService;

    public List<MonthlyExpenses> getAllMonthlyExpenses(){
        return monthlyrep.findAll();
    }

    // public double getAllCarwashExpenses(CarwashExpenses carwashExpenses1){
    //     double total = 0.0;
    //     CarwashExpenses carwashExpenses = new CarwashExpenses();
    //     carwashExpenses.getPrice();
    //     for(CarwashExpenses carwashExpenses2 : carwashExpenses1){
    //         total =+ carwashExpenses.getPrice();
    //     }

    //     return carwashExpensesService.getAllCarwashExpenses();
    // }

}
