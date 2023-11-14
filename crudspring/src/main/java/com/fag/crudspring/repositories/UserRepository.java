package com.fag.crudspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fag.crudspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
}
