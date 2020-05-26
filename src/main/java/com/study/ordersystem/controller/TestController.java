package com.study.ordersystem.controller;

import com.study.ordersystem.common.ResultBean;
import com.study.ordersystem.entity.Food;
import com.study.ordersystem.entity.Order;
import com.study.ordersystem.entity.User;
import com.study.ordersystem.service.impl.FoodServiceImpl;
import com.study.ordersystem.service.impl.OrderServiceImpl;
import com.study.ordersystem.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    FoodServiceImpl foodService;
    @Autowired
    OrderServiceImpl orderService;

    @GetMapping("/user/{id}")
    public ResultBean<User> testUser(@PathVariable("id") long id){
        User user = userService.getById(id);
        if (user==null){
            return new ResultBean(404,"没有找到",null);
        }
        return new ResultBean(200,"成功获取",user);
    }
    @GetMapping("/food/{id}")
    public ResultBean<Food> testFood(@PathVariable("id") long id){
        Food food = foodService.getById(id);
        if (food==null){
            return new ResultBean(404,"没有找到",null);
        }
        return new ResultBean(200,"成功获取",food);
    }
    @GetMapping("/order/{id}")
    public ResultBean<Order> testOrder(@PathVariable("id") long id){
        Order order = orderService.getById(id);
        if (order==null){
            return new ResultBean(404,"没有找到",null);
        }
        return new ResultBean(200,"成功获取",order);
    }
}
