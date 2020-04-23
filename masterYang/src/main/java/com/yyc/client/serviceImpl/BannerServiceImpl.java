package com.yyc.client.serviceImpl;

import com.yyc.client.mapper.BannerMapper;
import com.yyc.client.pojo.Banner;
import com.yyc.client.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerMapper bannerMapper;

    @Override
    public List<Banner> selectAll() {
        return bannerMapper.selectAll();
    }
}
