package com.fueltasker.fueltasker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.ToDoList;
import com.fueltasker.fueltasker.Exception.ReminderAlreadyTaken;
import com.fueltasker.fueltasker.Exception.ReminderTitleDoesNotExist;
import com.fueltasker.fueltasker.Repository.ToDoList.ToDoListRepository;

@Service
public class ToDoListService {
    @Autowired
    ToDoListRepository todorep;

    public List<ToDoList> getAllTasks(){
        return todorep.findAll();
    }

    public ToDoList createTask(ToDoList todolist){
        List<ToDoList> foundtaskname = todorep.findByTaskname(todolist.getTaskname());


        if(!foundtaskname.isEmpty()){
            throw new ReminderAlreadyTaken("Task with title '" + todolist.getTaskname() + "' already exists");
        }else{
            return todorep.save(todolist);
        }
    }
    public ToDoList updateTask(String taskname, ToDoList newDetailsTask) {
        List<ToDoList> task = todorep.findByTaskname(taskname);
    
        if (task.isEmpty()) {
            throw new ReminderTitleDoesNotExist("Task with title '" + taskname + "' does not exist");
        }
        ToDoList todolist = task.get(0);
        todolist.setTaskname(newDetailsTask.getTaskname());
        todolist.setDescription(newDetailsTask.getDescription());
    
        return todorep.save(todolist);
    }

    public String deleteTask(String taskname){
        String msg = "";
        List<ToDoList> toDoLists = todorep.findByTaskname(taskname);

        ToDoList existingTask = toDoLists.get(0);
        if(existingTask.getTaskname() != null){
            todorep.delete(existingTask);
            msg = "Task with '" + taskname + "' has been deleted!";
        }else{
            msg = "Task with '" + taskname + "' does not exits!";
        }
            return msg;
    }
}
