package com.yyc.client.mapper;

import com.yyc.client.pojo.Banner;
import com.yyc.client.pojo.BannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerMapper {
    int countByExample(BannerExample example);

    int deleteByExample(BannerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Banner record);

    int insertSelective(Banner record);

    List<Banner> selectByExample(BannerExample example);

    Banner selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

    List<Banner> selectAll();

}