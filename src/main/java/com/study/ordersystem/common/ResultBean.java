package com.study.ordersystem.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean<T> {
    private int code;
    private String msg;
    private T data;

}
