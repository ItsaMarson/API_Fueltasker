package com.fueltasker.fueltasker.Repository.ToDoList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.ToDoList;

public interface ToDoListRepository extends JpaRepository<ToDoList, String> {
     List<ToDoList> findByTaskname(String taskname);
}
