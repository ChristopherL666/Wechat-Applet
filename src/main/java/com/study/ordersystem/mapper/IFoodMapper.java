package com.study.ordersystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.ordersystem.entity.Food;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IFoodMapper extends BaseMapper<Food> {

}
