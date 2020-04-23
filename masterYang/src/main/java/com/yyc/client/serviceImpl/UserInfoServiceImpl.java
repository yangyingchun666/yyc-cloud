package com.yyc.client.serviceImpl;

import com.yyc.client.mapper.UserInfoMapper;
import com.yyc.client.pojo.Test1;
import com.yyc.client.pojo.UserInfo;
import com.yyc.client.service.UserInfoService;
import com.yyc.client.utils.Page;
import com.yyc.client.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public Integer insert(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public Integer selectCountByParam(String verifyPhone,String verifyUsername) {
        return userInfoMapper.selectCountByParam(verifyPhone,verifyUsername);
    }

    @Override
    public String selectPwdByUsername(String username) {
        return userInfoMapper.selectPwdByUsername(username);
    }

    @Override
    public UserInfo selectByUsername(String username) {
        return userInfoMapper.selectByUsername(username);
    }

    @Override
    public List<UserInfoVO> selectPageList(Page page) {
        return userInfoMapper.selectPageList(page);
    }

    @Override
    public int selectPageCount(Page page) {
        return userInfoMapper.selectPageCount(page);
    }

    @Override
    public UserInfoVO selectUserInfoById(String id) {
        return userInfoMapper.selectUserInfoById(id);
    }

    @Override
    public Integer update(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }


}
