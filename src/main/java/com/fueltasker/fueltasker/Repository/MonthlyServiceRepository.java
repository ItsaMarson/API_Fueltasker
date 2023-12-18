package com.fueltasker.fueltasker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.MonthlyExpenses;

public interface MonthlyServiceRepository extends JpaRepository<MonthlyExpenses, Integer>{

}
