package com.study.ordersystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.ordersystem.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOrderMapper extends BaseMapper<Order> {
}
