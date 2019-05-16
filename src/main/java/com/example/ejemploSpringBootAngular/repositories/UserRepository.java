package com.example.ejemploSpringBootAngular.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ejemploSpringBootAngular.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	
}
