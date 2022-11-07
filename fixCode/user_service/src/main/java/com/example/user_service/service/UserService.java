package com.example.user_service.service;

import com.example.user_service.entity.User;

import java.util.List;
import java.util.Objects;

public interface UserService {
    public List<User> getAllUser();
    public User themUser(User user);
    public List<Object> getAllDepartmentByRestTemplate();
}
