package com.fueltasker.fueltasker.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.Users;
import com.fueltasker.fueltasker.Exception.EmailAlreadyTakenException;
import com.fueltasker.fueltasker.Repository.UsersRepository;

@Service
public class UserService {
    @Autowired
    UsersRepository userrep;

    public Users createUser(Users users){
        return userrep.save(users);
    }
    public List<Users> getAllUsers(){
        return userrep.findAll();
    }
    public Users updateUsers(String email, Users userNewDetails){
        List<Users> emailfound = userrep.findByeMail(email);

            if (!emailfound.isEmpty()) {
            throw new EmailAlreadyTakenException("Reminder with title '" + email + "' does not exist");
        }
            Users users = emailfound.get(0);
            users.setfName(userNewDetails.getfName());
            users.setlName(userNewDetails.getlName());
            users.seteMail(userNewDetails.geteMail());
            users.setpWord(userNewDetails.getpWord());
         
            return userrep.save(users);
        
    }
    
}
