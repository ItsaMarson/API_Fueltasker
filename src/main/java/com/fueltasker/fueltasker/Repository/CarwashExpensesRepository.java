package com.fueltasker.fueltasker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.fueltasker.fueltasker.Entity.CarwashExpenses;

public interface CarwashExpensesRepository extends JpaRepository<CarwashExpenses, Integer>{
    List<CarwashExpenses> findByTitle(String title);
}
