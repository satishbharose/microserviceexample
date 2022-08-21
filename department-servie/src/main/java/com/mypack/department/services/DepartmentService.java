package com.mypack.department.services;

import com.mypack.department.domain.Department;
import com.mypack.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment methodof DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long id) {
        log.info("Inside getDepartment method  of DepartmentService");
        return departmentRepository.findByDepartmentId(id);
    }
}
