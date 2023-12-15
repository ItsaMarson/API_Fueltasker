package com.fueltasker.fueltasker.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fueltasker.fueltasker.Entity.VehicleOwner;
import com.fueltasker.fueltasker.Exception.UsernameAlreadyTakenException;
import com.fueltasker.fueltasker.Repository.VehicleOwnerRepository;

@Service
public class VehicleOwnerService {
    @Autowired
    VehicleOwnerRepository verep;
    
    public List<VehicleOwner> getAllOwners(){
        return verep.findAll();
    }
    public List<VehicleOwner> findVehicleOwners(String lastname){
        return verep.findByLastname(lastname);
    }
    public VehicleOwner insertVehicleOwner(VehicleOwner vOwner){
        Optional <VehicleOwner> foundUsername = verep.findByUsername(vOwner.getUsername());
        if (foundUsername.isPresent()) {
            throw new UsernameAlreadyTakenException("This Username is already taken: " +vOwner.getUsername());
        }else{
            return verep.save(vOwner);
        }
    }
    public String deleteVehicleOwner(int vo_id){
        String msg = "";

        if(verep.findById(vo_id) != null){
            verep.deleteById(vo_id);
            msg = "Vehicle Owner with " + vo_id + " has been deleted!";
        }else{
            msg = "Vehicle Owner with " + vo_id + " does not Exist";
        }
            return msg;
    }
    @SuppressWarnings("finally")
    public VehicleOwner updateVehicleOwner(int vo_id, VehicleOwner nVehicleOwner){
        VehicleOwner vehicle = new VehicleOwner();
        try {
            vehicle = verep.findById(vo_id).get();
            vehicle.setFirstname(nVehicleOwner.getFirstname());
            vehicle.setLastname(nVehicleOwner.getLastname());
            vehicle.setUsername(nVehicleOwner.getUsername());
            vehicle.setPassword(nVehicleOwner.getPassword());
            vehicle.setE_add(nVehicleOwner.getE_add());
            vehicle.setPhonenumber(nVehicleOwner.getPhonenumber());
            vehicle.setVehicle_type(nVehicleOwner.getVehicle_type());
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Vehicle Owner "+vo_id+"does not Existed!");
        }finally{
            return verep.save(vehicle);
        }
    }
}
