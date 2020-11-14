package com.tekleads.service;

import com.tekleads.entity.Department;
import com.tekleads.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  public DepartmentRepository departmentRepository;

  @Override
  public Department saveDepartment(Department department) {
    log.info("Inside saveDepartment service");
    return departmentRepository.save(department);
  }

  @Override
  public Department findDepartmentById(Long departmentId) {
    log.info("Inside findDepartmentById service");
    return departmentRepository.findByDepartmentId(departmentId);
  }
}
