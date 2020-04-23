package com.yyc.client.controller;

import com.yyc.client.pojo.Test1;
import com.yyc.client.pojo.UserRole;
import com.yyc.client.service.UserRoleService;
import com.yyc.client.utils.Page;
import com.yyc.client.utils.ResultMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
@Slf4j
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;


    @RequestMapping("/dataGrid")
    @ResponseBody
    public ResultMap<List<Test1>> backContent(Page page, @RequestParam("limit") int limit) {
        log.info("limit{}", limit);
        log.info("page{}", page.toString());
        page.setRows(limit);
        List<UserRole> contentList = userRoleService.selectPageList(page);
        int totals = userRoleService.selectPageCount(page);
        page.setTotalRecord(totals);
//            redisUtil.set("data", JSON.toJSONString(contentList));
//            redisUtil.set("pageCount", "" + totals);
//            redisUtil.expire("data", ExpireTime);
        return new ResultMap("成功", contentList, 0, totals);
    }

}
