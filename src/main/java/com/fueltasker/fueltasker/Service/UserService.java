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
        users.seteMail(users.geteMail());
        return userrep.save(users);
    }
    public List<Users> getAllUsers(){
        return userrep.findAll();
    }
    @SuppressWarnings("finally")
    public Users updateUsers(int userID, Users userNewDetails){
        Users users = new Users();
        try {
            users = userrep.findById(userID).get();
            users.setfName(userNewDetails.getfName());
            users.setlName(userNewDetails.getlName());
            users.seteMail(userNewDetails.geteMail());
            users.setpWord(userNewDetails.getpWord());
            users.setPhonenumber((userNewDetails.getPhonenumber()));
            users.setDateofbirth(userNewDetails.getDateofbirth());
        }catch (NoSuchElementException e){
            throw new EmailAlreadyTakenException("Users "+userID+"does not Existed!");
        }finally{
            return userrep.save(users);
        }
            
    }
    
}
