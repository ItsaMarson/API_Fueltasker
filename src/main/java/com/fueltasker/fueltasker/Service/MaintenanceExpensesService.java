package com.fueltasker.fueltasker.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.MaintenanceExpenses;
import com.fueltasker.fueltasker.Repository.MaintenanceExpensesRepository;

@Service
public class MaintenanceExpensesService {
    @Autowired
    MaintenanceExpensesRepository maintenancerep;

    

    public List<MaintenanceExpenses> getAllMaintenanceExpenses(){
        return maintenancerep.findAll();
    }

    public MaintenanceExpenses addData(MaintenanceExpenses maintenanceExpenses){
        return maintenancerep.save(maintenanceExpenses);
    }

    public String deleteMaintenanceExpenses(String title){
        String msg = "";
            List<MaintenanceExpenses> foundtitle = maintenancerep.findByTitle(title);

            MaintenanceExpenses maintenance = foundtitle.get(0);
            if(maintenance.getTitle() != null){
                maintenancerep.delete(maintenance);
                msg = "MaintenanceExpenses with "+title+" has been deleted!";
            }else{
                msg = "MaintenanceExpenses with "+ title + " does not exist!";
            }
        return msg;
    }

}
