package com.yyc.client.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class UserInfo {
    private String id;

    private String username;

    private String password;

    private String sex;

    private String city;

    private String sign;

    private String phone;

    private String birth;

    private String roleId;

    private String headerImgPath;

    private Date createTime;

    private Date updateTime;


}