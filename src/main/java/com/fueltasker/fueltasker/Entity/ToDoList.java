package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblTask")
public class ToDoList {
    @Id
   
    private String taskname;
    private String description;

    public ToDoList(){super();}

    public ToDoList(String taskname, String description) {
        this.taskname = taskname;
        this.description = description;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String decsription) {
        this.description = decsription;
    }
    
}
