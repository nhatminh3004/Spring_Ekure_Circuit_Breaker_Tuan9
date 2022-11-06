package com.example.department_service.RestController;

import com.example.department_service.entity.Department;
import com.example.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/getAllDepartment")
    public List<Department> getDepartments(){
        return departmentService.getallDepartment();
    }
    @PostMapping("/addDepartment")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

}
