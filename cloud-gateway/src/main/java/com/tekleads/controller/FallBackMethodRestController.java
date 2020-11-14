package com.tekleads.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodRestController {


  @GetMapping("/userServiceFallBack")
  public String userServiceFallBackMethod() {
    return "User Service is taking longer than Expected time"
        + "Please Try Again Later Thank You!!!";
  }

  @GetMapping("/departmentServiceFallBack")
  public String departmentServiceFallBackMethod() {
    return "Department Service is taking longer than expected time"
        + "Please try again later Thank You!!!";
  }

}
