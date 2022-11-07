package com.example.user_service.service;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements  UserService{

    private RestTemplate restTemplate;

    public UserServiceImpl() {
        this.restTemplate= new RestTemplate();
    }

    public String URL_GETALLDEPARTMENT_RESTTEMPLATE="http://localhost:8002/departments/getAllDepartment";
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User themUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<Object> getAllDepartmentByRestTemplate() {
        return this.restTemplate.getForObject(URL_GETALLDEPARTMENT_RESTTEMPLATE, ArrayList.class);
    }
}
