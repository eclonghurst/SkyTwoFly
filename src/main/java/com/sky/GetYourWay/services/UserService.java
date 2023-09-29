package com.sky.GetYourWay.services;

import com.sky.GetYourWay.domain.User;
import com.sky.GetYourWay.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String registerUser(User user) {
        return userRepo.save(user).getFullName();
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

    public User getUserByEmail(String email) {
        return userRepo.findByEmailIgnoreCase(email);
    }

    public void deleteUser(User user) {
        userRepo.delete(user);
    }
}
