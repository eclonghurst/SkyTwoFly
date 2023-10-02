package com.sky.GetYourWay.services;

import com.sky.GetYourWay.domain.MyUserDetails;
import com.sky.GetYourWay.domain.User;
import com.sky.GetYourWay.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User found = this.repo.findByEmailIgnoreCase(username)
                .orElseThrow(() -> new UsernameNotFoundException("No user exists with name: " + username));
        return new MyUserDetails(found);

    }
}
