package com.study.ordersystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_food")
public class Food {
    @TableId(type = IdType.AUTO)
    private long fId;
    private String fName;
    private BigDecimal fPrice;
    private String fImage;
}
