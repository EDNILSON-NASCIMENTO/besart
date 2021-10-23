package com.besart.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.besart.loja.entities.User;

@Repository
public interface UserRepository  extends JpaRepository <User, Long>{

	
	
}
