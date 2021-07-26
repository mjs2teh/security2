package com.javainuse.repository;
//import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
