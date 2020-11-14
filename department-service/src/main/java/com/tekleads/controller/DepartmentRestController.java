package com.tekleads.controller;

import com.tekleads.entity.Department;
import com.tekleads.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentRestController {

  @Autowired
  private DepartmentService departmentService;


  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department department) {
    log.info("Inside saveDepartment restController");
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/{id}")
  public Department findDepartmentById(@PathVariable("id") Long departmentId) {
    log.info("Inside findDepartmentById restController");
    return departmentService.findDepartmentById(departmentId);
  }

}
