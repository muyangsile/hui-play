package com.play.service;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/15 9:25
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public interface SysUserInfoService {
    /**
     * 后台管理系统的登录方法
     * @param username 用户名
     * @param password 密码
     * @return
     */
    String login(HttpServletRequest request, String username, String password);
}
