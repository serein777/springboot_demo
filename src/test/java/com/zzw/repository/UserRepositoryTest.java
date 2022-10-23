package com.zzw.repository;

import com.zzw.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Resource
    UserRepository userRepository;
    @Test
    void  findAll(){
        List<User> users = userRepository.findAll();
        for(User u:users){
            System.out.println(u.getName());
        }
    }


}