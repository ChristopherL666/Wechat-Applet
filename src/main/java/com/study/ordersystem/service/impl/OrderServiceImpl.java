package com.study.ordersystem.service.impl;

import com.study.ordersystem.entity.Order;
import com.study.ordersystem.mapper.IOrderMapper;
import com.study.ordersystem.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderMapper orderMapper;

    public Order getById(long id){
        return orderMapper.selectById(id);
    }
}
