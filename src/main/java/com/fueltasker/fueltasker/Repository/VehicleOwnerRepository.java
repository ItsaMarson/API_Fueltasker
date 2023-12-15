package com.fueltasker.fueltasker.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.VehicleOwner;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, Integer>{
    List<VehicleOwner> findByLastname(String lastname);
    Optional<VehicleOwner> findByUsername(String username);
}
