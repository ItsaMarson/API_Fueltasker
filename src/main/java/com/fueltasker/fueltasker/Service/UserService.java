package com.fueltasker.fueltasker.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.Users;
import com.fueltasker.fueltasker.Exception.ReminderTitleDoesNotExist;
import com.fueltasker.fueltasker.Repository.UsersRepository;

@Service
public class UserService {
    @Autowired
    UsersRepository userrep;

    public Users createUser(Users users){
        users.seteMail(users.geteMail());
        return userrep.save(users);
    }
    public List<Users> getAllUsers(){
        return userrep.findAll();
    }
    public Users updateUsers(String email, Users userNewDetails){
            List<Users> user = userrep.findByeMail(email);
    
        if (user.isEmpty()) {
            throw new ReminderTitleDoesNotExist("User with email '" + email + "' does not exist");
        }
        Users existingUsers = user.get(0);
            existingUsers.setfName(userNewDetails.getfName());
            existingUsers.setlName(userNewDetails.getlName());
            existingUsers.seteMail(userNewDetails.geteMail());
            existingUsers.setpWord(userNewDetails.getpWord());
            existingUsers.setPhonenumber((userNewDetails.getPhonenumber()));
            existingUsers.setDateofbirth(userNewDetails.getDateofbirth());

            return userrep.save(existingUsers);
    }
    public Users getUserById(int userId) {
        return userrep.findById(userId).orElse(null);
    }
}
