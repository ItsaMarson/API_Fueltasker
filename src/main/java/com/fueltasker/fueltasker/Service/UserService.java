package com.fueltasker.fueltasker.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fueltasker.fueltasker.Entity.Users;
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
    
}
