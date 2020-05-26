package com.study.ordersystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.ordersystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper extends BaseMapper<User> {
}
