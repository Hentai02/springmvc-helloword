package com.example.dao;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    //Logger logger = Logger.getLogger(this.getClass().getName());

    private final UserMapper userMapper;

    @Autowired
    public UserDaoImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUser() {
        User user = userMapper.getUser();
        return userMapper.getUser();
    }

}
