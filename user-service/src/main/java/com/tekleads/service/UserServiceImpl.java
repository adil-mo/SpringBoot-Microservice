package com.tekleads.service;

import com.tekleads.VO.Department;
import com.tekleads.VO.ResponseTemplateVO;
import com.tekleads.entity.User;
import com.tekleads.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public User saveUser(User user) {
    log.info("In the saveUser userService");
    return userRepository.save(user);
  }

  @Override
  public ResponseTemplateVO findUserWithDepartmentId(Long id) {
    log.info("In the findByUserId userService");
    ResponseTemplateVO vo = new ResponseTemplateVO();

    User user = userRepository.findByUserId(id);
    Department department = restTemplate
        .getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
            Department.class);

    vo.setUser(user);
    vo.setDepartment(department);

    return vo;
  }
}
