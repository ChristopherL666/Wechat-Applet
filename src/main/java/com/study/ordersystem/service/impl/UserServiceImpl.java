package com.study.ordersystem.service.impl;

import com.study.ordersystem.entity.User;
import com.study.ordersystem.mapper.IUserMapper;
import com.study.ordersystem.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IFoodService {
    @Autowired
    IUserMapper userMapper;

    public User getById(long id){
        return userMapper.selectById(id);
    }
}
