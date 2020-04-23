package com.yyc.client.service;

import com.yyc.client.pojo.UserRole;
import com.yyc.client.utils.Page;

import java.util.List;

public interface UserRoleService {
    List<UserRole> selectPageList(Page page);

    int selectPageCount(Page page);
}
