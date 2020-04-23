package com.yyc.client.serviceImpl;

import com.yyc.client.mapper.UserRoleMapper;
import com.yyc.client.pojo.UserRole;
import com.yyc.client.service.UserRoleService;
import com.yyc.client.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleMapper userRoleMapper;


    @Override
    public List<UserRole> selectPageList(Page page) {
        return userRoleMapper.selectPageList(page);
    }

    @Override
    public int selectPageCount(Page page) {
        return  userRoleMapper.selectPageCount(page);
    }
}
