package com.play.controller;

import com.play.comment.ResultJSON;
import com.play.service.SysUserInfoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/15 9:00
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Controller
public class SysUserInfoController {
    @Autowired
    private SysUserInfoService sysUserInfoService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request, String username, String password) {
        return sysUserInfoService.login(request, username, password);
    }
}
