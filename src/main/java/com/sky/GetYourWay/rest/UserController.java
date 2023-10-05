package com.sky.GetYourWay.rest;

import com.sky.GetYourWay.domain.User;
import com.sky.GetYourWay.dtos.UserDTO;
import com.sky.GetYourWay.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody @Validated User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @GetMapping("/getUserID/{email}")
    public ResponseEntity<Integer> getUserID(@PathVariable String email) {
        User found = userService.getUserByEmail(email);
        if (found == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(found.getUserId(), HttpStatus.OK);
    }

    @GetMapping("/getUserDetails/{id}")
    public ResponseEntity<UserDTO> getUserDetails(@PathVariable Integer id) {
        User found = userService.getUserById(id);
        if (found == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(new UserDTO(found), HttpStatus.OK);
    }

    @GetMapping("/user")
    public String getCurrentUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        User found = userService.getUserById(id);
        if (found == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else {
            userService.deleteUser(found);
            return new ResponseEntity<>("User with ID " + id + " deleted", HttpStatus.OK);
        }
    }
}
