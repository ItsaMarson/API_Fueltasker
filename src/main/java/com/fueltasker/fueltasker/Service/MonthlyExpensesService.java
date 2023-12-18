package com.fueltasker.fueltasker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.MonthlyExpenses;
import com.fueltasker.fueltasker.Repository.MonthlyServiceRepository;

@Service
public class MonthlyExpensesService {
    @Autowired
    MonthlyServiceRepository monthlyrep;

    public List<MonthlyExpenses> getAllMonthlyExpenses(){
        return monthlyrep.findAll();
    }
}
