package com.yyc.client.service;

import com.yyc.client.pojo.GoodsLocation;
import com.yyc.client.utils.Page;

import java.util.List;

public interface GoodLocationService {
    List<GoodsLocation> selectPageList(Page page);

    int selectPageCount(Page page);

    List<GoodsLocation> selectAll();

    Integer insert(GoodsLocation goodsLocation);

    int delete(String id);

    int update(GoodsLocation goodsLocation);

    GoodsLocation selectById(String id);
}
