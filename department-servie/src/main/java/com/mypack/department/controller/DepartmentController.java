package com.mypack.department.controller;

import com.mypack.department.domain.Department;
import com.mypack.department.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id){
        log.info("Inside save department of getDepartment");
        return departmentService.getDepartment(id);
    }
}
