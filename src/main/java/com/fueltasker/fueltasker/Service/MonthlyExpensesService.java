package com.fueltasker.fueltasker.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.CarwashExpenses;
import com.fueltasker.fueltasker.Entity.MonthlyExpenses;
import com.fueltasker.fueltasker.Repository.CarwashExpensesRepository;
import com.fueltasker.fueltasker.Repository.MonthlyServiceRepository;

@Service
public class MonthlyExpensesService {
    @Autowired
    MonthlyServiceRepository monthlyrep;
    @Autowired
    CarwashExpensesRepository carrep;

    @Autowired
    CarwashExpensesService carwashExpensesService;

    public List<MonthlyExpenses> getAllMonthlyExpenses(){
        return monthlyrep.findAll();
    }

    public List<CarwashExpenses> getAllCarwashExpenses(){
        double total = 0.0;
        List<CarwashExpenses> carwashExpenses1 = new ArrayList<>();
        
        for(CarwashExpenses carwashExpenses2 : carwashExpenses1){
            total += carwashExpenses2.getPrice();
        }
        return carrep.findAll();
    }

}
