package com.tekleads.service;

import com.tekleads.VO.ResponseTemplateVO;
import com.tekleads.entity.User;

public interface UserService {

  public User saveUser(User user);

  public ResponseTemplateVO findUserWithDepartmentId(Long id);

}
