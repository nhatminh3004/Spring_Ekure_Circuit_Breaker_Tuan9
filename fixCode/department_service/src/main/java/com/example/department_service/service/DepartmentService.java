package com.example.department_service.service;

import com.example.department_service.entity.Department;

import java.util.List;
import java.util.Objects;

public interface DepartmentService {
    public List<Department> getallDepartment();
    public Department addDepartment(Department department);

}
