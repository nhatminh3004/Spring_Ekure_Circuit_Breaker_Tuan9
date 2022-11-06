package com.example.user_service.RestController;

import com.example.user_service.entity.User;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Value("${user.username}")
    private String userName;
    @Autowired
    private UserService userService;
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping("/themUser")
    public  User themUser(@RequestBody User user){
        return userService.themUser(user);
    }
    @GetMapping("/getProperties")
    public String helloUserService(){
        return  userName;
    }
}
