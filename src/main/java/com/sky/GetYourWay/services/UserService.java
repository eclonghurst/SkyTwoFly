package com.sky.GetYourWay.services;

import com.sky.GetYourWay.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
