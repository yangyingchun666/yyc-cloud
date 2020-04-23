package com.yyc.client.mapper;

import com.yyc.client.pojo.Test1;
import com.yyc.client.pojo.UserInfo;
import com.yyc.client.utils.Page;
import com.yyc.client.vo.UserInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    Integer selectCountByParam(@Param("verifyPhone") String verifyPhone, @Param("verifyUsername") String verifyUsername);

    String selectPwdByUsername(@Param("username") String username);

    UserInfo selectByUsername(@Param("username") String username);

    List<UserInfoVO> selectPageList(Page page);

    int selectPageCount(Page page);

    UserInfoVO selectUserInfoById(@Param("id") String id);

    Integer updateByPrimaryKeySelective(UserInfo userInfo);
}