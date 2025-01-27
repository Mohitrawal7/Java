package com.mohit.SpringSecurity.service;

import com.mohit.SpringSecurity.model.UserPrincipal;
import com.mohit.SpringSecurity.model.Users;
import com.mohit.SpringSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       Users user =  userRepo.findByUserName(username);
        if (user == null){
                 System.out.println("user not found");
                 throw new UsernameNotFoundException("user not found");
        }
                 return new UserPrincipal(user);
    }
}
