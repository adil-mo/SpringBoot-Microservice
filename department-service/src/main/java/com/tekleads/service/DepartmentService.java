package com.tekleads.service;

import com.tekleads.entity.Department;

public interface DepartmentService {

  public Department saveDepartment(Department department);

  public Department findDepartmentById(Long id);

}
