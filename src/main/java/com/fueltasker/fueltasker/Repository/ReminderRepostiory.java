package com.fueltasker.fueltasker.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.Reminder;

public interface ReminderRepostiory extends JpaRepository<Reminder, String>{
    List<Reminder> findByTitle(String title);
}
