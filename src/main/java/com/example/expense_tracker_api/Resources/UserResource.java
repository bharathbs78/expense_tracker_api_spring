package com.example.expense_tracker_api.Resources;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String,Object> userMap){
        String firstName=userMap.get("firstName").toString();
        String lastName=userMap.get("lastName").toString();
        String email=userMap.get("email").toString();
        String password=userMap.get("password").toString();
        return firstName+" "+lastName+" "+email+" "+password;
    }
}
