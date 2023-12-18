package com.fueltasker.fueltasker.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fueltasker.fueltasker.Entity.CustomizationExpenses;

@Repository
public interface CustomizationExpensesRepository extends JpaRepository<CustomizationExpenses, Integer>{
    List<CustomizationExpenses> findByTitle(String title);
}
