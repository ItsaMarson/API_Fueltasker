package com.fueltasker.fueltasker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fueltasker.fueltasker.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    
}
