package com.yyc.client.service;

import com.yyc.client.pojo.Test1;
import com.yyc.client.pojo.UserInfo;
import com.yyc.client.utils.Page;
import com.yyc.client.vo.UserInfoVO;

import java.util.List;

public interface UserInfoService {

    Integer insert(UserInfo userInfo);

    Integer selectCountByParam(String verifyPhone, String verifyUsername);

    String selectPwdByUsername(String username);

    UserInfo selectByUsername(String username);

    List<UserInfoVO> selectPageList(Page page);

    int selectPageCount(Page page);

    UserInfoVO selectUserInfoById(String id);

    Integer update(UserInfo userInfo);
}
