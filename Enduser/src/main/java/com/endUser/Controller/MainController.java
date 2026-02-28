package com.endUser.Controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class MainController {

    @GetMapping("/testing")
    public void testing(){
        System.out.println("testing");

    }
}
