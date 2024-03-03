package com.SpringBootJWT.z.Jwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HomeController {

    @GetMapping("/user")
    public String getName(){

        return "Home-------------------------------";
    }
}
