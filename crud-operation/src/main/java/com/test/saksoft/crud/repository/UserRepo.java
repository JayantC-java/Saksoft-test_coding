package com.test.saksoft.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.saksoft.crud.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
}
