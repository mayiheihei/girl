package com.imooc.conntroller;

import com.imooc.domain.Users;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<Users> findAll(){
       return userService.findAll();
    }


    @PostMapping("/addUser")
    public Users saveUser(Users users){

       return userService.addUser(users);
    }

}
