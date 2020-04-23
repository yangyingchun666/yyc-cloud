package com.yyc.client.service;

import com.yyc.client.pojo.Classify;
import com.yyc.client.utils.Page;
import com.yyc.client.vo.ClassifyVO;

import java.util.List;

public interface ClassifyService {
    List<Classify> selectPageList(Page page);

    int selectPageCount(Page page);

    List<Classify> selectClassifyByLevel(Integer level);

    String selectParentIdById(String getgClassfyId);

    List<ClassifyVO> getClassify();

    List<ClassifyVO> getClassifyChildren(String parentId);

    List<Classify> getClassifyAll();

    Integer selectParentLevel(String cParentId);

    int insert(Classify classify);

    Classify selectClasssifyById(String id);

    int update(Classify classify);

    int deleteById(String id);
}
