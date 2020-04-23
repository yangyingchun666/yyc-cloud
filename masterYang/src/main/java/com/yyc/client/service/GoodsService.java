package com.yyc.client.service;

import com.yyc.client.pojo.Goods;
import com.yyc.client.utils.Page;

import java.util.List;

public interface GoodsService {
    List<Goods> selectPageList(Page page);

    int selectPageCount(Page page);

    Integer insert(Goods goods);

    Integer deleteById(String id);

    Integer update(Goods goods);

    Goods selectById(String id);
}
