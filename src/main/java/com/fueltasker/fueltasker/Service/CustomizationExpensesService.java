package com.fueltasker.fueltasker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.CustomizationExpenses;
import com.fueltasker.fueltasker.Repository.CustomizationExpensesRepository;

@Service
public class CustomizationExpensesService {
    @Autowired
    CustomizationExpensesRepository customrep;

    public List<CustomizationExpenses> getAllCustomizationExpenses(){
        return customrep.findAll();
    }

    public CustomizationExpenses addDataExpenses(CustomizationExpenses customizationExpenses){
        return customrep.save(customizationExpenses);
    }

    public String deleteCustomizationExpenses(String title){
        String msg = "";
            List<CustomizationExpenses> foundtitle = customrep.findByTitle(title);

            CustomizationExpenses customization = foundtitle.get(0);
            if(customization.getTitle() != null){
                customrep.delete(customization);
                msg = "CustomizationExpenses with "+title+" has been deleted!";
            }else{
                msg = "CustomizationExpenses with "+ title + " does not exist!";
            }
        return msg;
    }
}
