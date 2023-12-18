package com.fueltasker.fueltasker.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reminders")
public class Reminder {
    @Id
    private String title;
    private String description;
    private String timestart;
    private String date;
    public Reminder(){super();}
    
    public Reminder(String title, String description, String timestart, String date) {
        this.title = title;
        this.description = description;
        this.timestart = timestart;
        this.date = date;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTimestart() {
        return timestart;
    }
    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
}
