package com.study.ordersystem.service.impl;

import com.study.ordersystem.entity.Food;
import com.study.ordersystem.mapper.IFoodMapper;
import com.study.ordersystem.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements IFoodService {
    @Autowired
    private IFoodMapper foodMapper;

    public Food getById(long id){
        return foodMapper.selectById(id);
    }
}
