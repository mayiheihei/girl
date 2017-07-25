package com.imooc.service;

import com.imooc.domain.Users;
import com.imooc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<Users> findAll(){
        return userRepository.findAll();
    }

    public Users addUser(Users users){
        Users users1 = new Users();
        users1.setFirstname(users.getFirstname());
        users1.setLastname(users.getLastname());
        users1.setEmail(users.getEmail());
        users1.setPhone(users.getPhone());
       return userRepository.save(users1);
    }
}
