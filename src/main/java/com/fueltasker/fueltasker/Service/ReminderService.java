package com.fueltasker.fueltasker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.Reminder;
import com.fueltasker.fueltasker.Exception.ReminderAlreadyTaken;
import com.fueltasker.fueltasker.Exception.ReminderTitleDoesNotExist;
import com.fueltasker.fueltasker.Repository.ReminderRepostiory;

@Service
public class ReminderService {
    @Autowired
    ReminderRepostiory rerep;

    public List<Reminder> getAllReminders(){
        return rerep.findAll();
    }
    public List<Reminder> getByTitle(String title){
        return rerep.findByTitle(title);
    }
    public Reminder createReminder(Reminder reminder){
        List<Reminder> foundTitle = rerep.findByTitle(reminder.getTitle());

        if(!foundTitle.isEmpty()){
            throw new ReminderAlreadyTaken("Reminder with title '" + reminder.getTitle() + "' already exists");
        }else{
            return rerep.save(reminder);
        }
    }
    public Reminder updateReminder(String title, Reminder newDetailsReminder) {
        List<Reminder> remind = rerep.findByTitle(title);
    
        if (remind.isEmpty()) {
            throw new ReminderTitleDoesNotExist("Reminder with title '" + title + "' does not exist");
        }
        Reminder existingReminder = remind.get(0);
        existingReminder.setDescription(newDetailsReminder.getDescription());
        existingReminder.setTimestart(newDetailsReminder.getTimestart());
        existingReminder.setDate(newDetailsReminder.getDate());
    
        return rerep.save(existingReminder);
    }
    public String deleteReminder(String title){
        String msg = "";
        List<Reminder> remind = rerep.findByTitle(title);

        Reminder existingReminder = remind.get(0);
        if(existingReminder.getTitle() != null){
            rerep.delete(existingReminder);
            msg = "Title with " + title + " has been deleted!";
        }else{
            msg = "Titl with " + title + " does not exits!";
        }
            return msg;
    }
    
    
}

