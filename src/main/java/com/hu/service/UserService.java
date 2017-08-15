package com.hu.service;

import com.hu.entity.User;
import com.hu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hu on 2017/8/15.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
