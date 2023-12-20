package com.fueltasker.fueltasker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.GasConsumption;
import com.fueltasker.fueltasker.Repository.GasConsumptionRepository;

@Service
public class GasConsumptionService {
    @Autowired
    GasConsumptionRepository gasrep;

    public GasConsumption addDataGasConsumption(GasConsumption gasConsumption){
        return gasrep.save(gasConsumption);
    }

    public List<GasConsumption> getAllGasConsumption(){
        return gasrep.findAll();
    }
}
