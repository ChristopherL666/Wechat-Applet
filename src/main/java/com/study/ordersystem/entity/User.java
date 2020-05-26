package com.study.ordersystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId(type = IdType.AUTO)
    private long uId;
    private String username;
    private String password;
    private String phone;
    //0未确定，1男，2女
    private int sex;
}
