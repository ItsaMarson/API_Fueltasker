package com.fueltasker.fueltasker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fueltasker.fueltasker.Entity.Reminder;
import com.fueltasker.fueltasker.Entity.ToDoList;
import com.fueltasker.fueltasker.Entity.Users;
import com.fueltasker.fueltasker.Entity.VehicleOwner;
import com.fueltasker.fueltasker.Service.ReminderService;
import com.fueltasker.fueltasker.Service.ToDoListService;
import com.fueltasker.fueltasker.Service.UserService;
import com.fueltasker.fueltasker.Service.VehicleOwnerService;

@RestController
@RequestMapping("/fueltasker")
public class FuelTasker {
    @Autowired
    VehicleOwnerService veserv;

    @Autowired
    ReminderService reserv;

    @Autowired
    ToDoListService todoserv;

    @Autowired
    UserService userserv;
    
    @GetMapping("/getAllVehicleOwners")
    public List<VehicleOwner> getAllOwners(){
        return veserv.getAllOwners();
    }
    @GetMapping("/VehicleOwners/{lastname}")
    public List<VehicleOwner> findBylastnamVehicleOwners(@PathVariable String lastname){
        return veserv.findVehicleOwners(lastname);
    }
    @PostMapping("/createUser")
    public VehicleOwner insertVehicleOwner(@RequestBody VehicleOwner vOwner){
        return veserv.insertVehicleOwner(vOwner);
    }
    @GetMapping("/getAllReminders")
    public List<Reminder> getAllReminders(){
        return reserv.getAllReminders();
    }
    @PostMapping("/createReminder")
    public Reminder createReminder(@RequestBody Reminder reminder){
        return reserv.createReminder(reminder);
    }
    @GetMapping("/ReminderTitle/{title}")
    public List<Reminder> getByTitle(@PathVariable String title){
        return reserv.getByTitle(title);
    }
    @PutMapping("/updateReminder")
    public Reminder updateReminder(@RequestParam String title, @RequestBody Reminder newDetailsReminder){
        return reserv.updateReminder(title, newDetailsReminder);
    }
    @PutMapping("/updateVehicleOwner")
    public VehicleOwner updatVehicleOwner(@RequestParam int vo_id, @RequestBody VehicleOwner nVehicleOwner){
        return veserv.updateVehicleOwner(vo_id, nVehicleOwner);
    }
    @DeleteMapping("/deleteReminder/{title}")
    public String deleteReminder(@PathVariable String title){
        return reserv.deleteReminder(title);
    }

    @DeleteMapping("/deleteVehicleOwner/{vo_id}")
    public String deleteVehicleOwner(@PathVariable int vo_id){
        return veserv.deleteVehicleOwner(vo_id);
    }
    @DeleteMapping("deleteTask/{taskname}")
    public String deleteTask(@PathVariable String taskname){
        return todoserv.deleteTask(taskname);
    }

    @GetMapping("/getAllTasks")
    public List<ToDoList> getAllTasks(){
        return todoserv.getAllTasks();
    }
    @PostMapping("/createTask")
    public ToDoList createTask(@RequestBody ToDoList toDoList){
        return todoserv.createTask(toDoList);
    }

    @PostMapping("/registerUser")
    public Users registerUser(@RequestBody Users users){
        return userserv.createUser(users);
    }

    @GetMapping("/getAllUsers")
    public List<Users> getAllUsers(){
        return userserv.getAllUsers();
    }

    @PutMapping("/updateUser")
    public Users updateUsers(@RequestParam String email, @RequestBody Users users){
        return userserv.updateUsers(email, users);
    }
}
