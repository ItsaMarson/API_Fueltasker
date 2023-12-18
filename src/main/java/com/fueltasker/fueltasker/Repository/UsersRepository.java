package com.fueltasker.fueltasker.Repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    List<Users> findByeMail(String eMail);
}
