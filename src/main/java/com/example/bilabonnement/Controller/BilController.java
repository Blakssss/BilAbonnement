package com.example.bilabonnement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BilController {
  @GetMapping("/")
  public String index(){
    return "Random";
  }

  @GetMapping("/login")
  public String trylogin(){
    return "Login";
  }
}
