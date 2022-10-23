package com.zzw.service;

import com.zzw.entity.User;
import com.zzw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUser(){
      return   userRepository.findAll();
    }
}
