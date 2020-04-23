package com.yyc.client.mapper;

import com.yyc.client.pojo.Test1;
import com.yyc.client.utils.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Test1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(Test1 record);

    Test1 selectByPrimaryKey(String id);

    List<Test1> selectAll();

    int updateByPrimaryKey(Test1 record);

    List<Test1> selectPageList(Page page);

    int selectPageCount(Page page);

    Integer selectCount();

    String selectPwdByUsername(@Param("username") String username);

    Test1 selectByUsernameAndPwd(@Param("username") String username);
}