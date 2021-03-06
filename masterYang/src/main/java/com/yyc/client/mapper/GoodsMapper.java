package com.yyc.client.mapper;

import com.yyc.client.pojo.Goods;
import com.yyc.client.pojo.GoodsExample;
import java.util.List;

import com.yyc.client.utils.Page;
import com.yyc.client.vo.GoodsVO;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(@Param("id") String id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(@Param("id") String id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    int selectPageCount(Page page);

    List<Goods> selectPageList(Page page);
}