package com.mohit.SpringSecurity.repo;

import com.mohit.SpringSecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

   Users findByUserName(String userName);
}
