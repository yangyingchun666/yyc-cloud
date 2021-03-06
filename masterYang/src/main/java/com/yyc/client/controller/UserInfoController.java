package com.yyc.client.controller;

import com.yyc.client.pojo.UserInfo;
import com.yyc.client.service.Test1Service;
import com.yyc.client.service.UserInfoService;
import com.yyc.client.service.UserRoleService;
import com.yyc.client.utils.JsonResult;
import com.yyc.client.utils.Page;
import com.yyc.client.utils.RedisUtil;
import com.yyc.client.utils.ResultMap;
import com.yyc.client.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/userInfo")
@Slf4j
public class UserInfoController {
    @Autowired
    Test1Service test1Service;

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserRoleService userRoleService;

    /**
     * layui-数据表格接口
     *
     * @return
     */
    @RequestMapping("/dataGrid")
    @ResponseBody
    public ResultMap<List<UserInfoVO>> backContent(Page page, @RequestParam("limit") int limit) {
        log.info("limit{}", limit);
        log.info("page{}", page.toString());
        page.setRows(limit);
        List<UserInfoVO> contentList = userInfoService.selectPageList(page);
        int totals = userInfoService.selectPageCount(page);
        page.setTotalRecord(totals);
        return new ResultMap("成功", contentList, 0, totals);
    }

    /**
     * 编辑页面
     */
    @RequestMapping("/editData")
    public String editDataPage(Model model, @RequestParam("id") String id) {
        log.info("编辑页面");
        UserInfoVO userInfo = userInfoService.selectUserInfoById(id);
        model.addAttribute("userInfo", userInfo);
        model.addAttribute("headerImgPath", userInfo.getHeaderImgPath());
        return "editPage/userInfoEdit";
    }

    /**
     * 保存修改页面
     *
     * @param userInfoVO
     * @return
     */
    @RequestMapping("/saveEdit")
    @ResponseBody
    public JsonResult saveEdit(@RequestBody UserInfoVO userInfoVO) {
        log.info("保存编辑页面");
        log.info("userInfoVO:{}", userInfoVO.toString());
        /**
         * 封装对象user_info
         */
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userInfoVO.getId());
        userInfo.setUsername(userInfoVO.getUsername());
        userInfo.setPhone(userInfoVO.getPhone());
        userInfo.setBirth(userInfoVO.getBirth());
        userInfo.setCity(userInfoVO.getCity());
        userInfo.setSex(userInfoVO.getSex());
        userInfo.setHeaderImgPath(userInfoVO.getHeaderImgPath());
        userInfo.setRoleId(userInfoVO.getRoleId());
        userInfo.setUpdateTime(new Date());
        Integer updateUserInfo = 0;
        updateUserInfo = userInfoService.update(userInfo);
        if (updateUserInfo < 1) {
            return new JsonResult(1);
        } else {
            return new JsonResult(0);
        }

    }


}
