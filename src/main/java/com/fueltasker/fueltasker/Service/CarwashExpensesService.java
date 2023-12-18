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

    public String deleteCarwashExpenses (String title){
        String msg = "";

        List<CarwashExpenses> foundtitle = carwashrepo.findByTitle(title);
        CarwashExpenses carwash = foundtitle.get(0);
        if(carwash.getTitle() != null){
            carwashrepo.delete(carwash);
            msg = "CarwashExpenses with " + title + " has been deleted!";
        }else{
            msg = "CarwashExpenses with" + title + " does not Exist!";
        }
            return msg;
    }
}
