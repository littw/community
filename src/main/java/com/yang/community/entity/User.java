package com.yang.community.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id; //id
    private String username; //用户名
    private String password; //密码
    private String salt;  ////密码盐值，加密数据
    private String email;
    private int type;  // 0普通 1关联 2版主
    private int status; //是否激活
    private String activationCode; //激活码
    private String headerUrl; //用户图片的访问路径
    private Date createTime; //用户注册时间
}
