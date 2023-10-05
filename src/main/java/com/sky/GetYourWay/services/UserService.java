package com.sky.GetYourWay.services;

import com.sky.GetYourWay.domain.User;
import com.sky.GetYourWay.repo.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    private final BCryptPasswordEncoder encoder;

    public UserService(UserRepo userRepo, BCryptPasswordEncoder encoder) {
        super();
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    public String registerUser(User user) {
        user.setPassword(this.encoder.encode(user.getPassword()));
        return userRepo.save(user).getFullName();
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

    public User getUserByEmail(String email) {
        return userRepo.findByEmailIgnoreCase(email).orElse(null);
    }

    public void deleteUser(User user) {
        userRepo.delete(user);
    }
}
