package com.qianfeng.springbootdemo02.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author wangAoJie
 * 2023-02-06 14:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private Integer age;
    private Date createTime;
}
