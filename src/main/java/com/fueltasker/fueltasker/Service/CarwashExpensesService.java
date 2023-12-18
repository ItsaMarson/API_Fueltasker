package com.fueltasker.fueltasker.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fueltasker.fueltasker.Entity.CarwashExpenses;
import com.fueltasker.fueltasker.Repository.CarwashExpensesRepository;

@Service
public class CarwashExpensesService {
    @Autowired
    CarwashExpensesRepository carwashrepo;


    public List<CarwashExpenses> getAllCarwashExpenses(){
        return carwashrepo.findAll();
    }

    public CarwashExpenses addDataCarwashExpenses(CarwashExpenses carwashExpenses){
        return carwashrepo.save(carwashExpenses);
    }
}
