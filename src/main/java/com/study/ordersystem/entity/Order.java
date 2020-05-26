package com.study.ordersystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_order")
public class Order {
    @TableId(type = IdType.AUTO)
    private long oId;
    private long uId;
    //食物ids
    private String foods;
    //食物数量s
    private String fNumbers;
    private long sendTime;
    private String sendAddress;
    private String markup;
    private int state;
    private BigDecimal oPrice;
}
