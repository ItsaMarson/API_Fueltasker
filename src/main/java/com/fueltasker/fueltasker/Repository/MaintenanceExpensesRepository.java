package com.fueltasker.fueltasker.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.MaintenanceExpenses;

public interface MaintenanceExpensesRepository extends JpaRepository<MaintenanceExpenses, Integer>{
    List<MaintenanceExpenses> findByTitle(String title);
}
