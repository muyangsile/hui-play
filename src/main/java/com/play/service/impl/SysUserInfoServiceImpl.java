package com.play.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.play.comment.ResultJSON;
import com.play.entity.SysUserInfo;
import com.play.mapper.SysUserInfoMapper;
import com.play.service.SysUserInfoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/15 9:26
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Service
public class SysUserInfoServiceImpl implements SysUserInfoService {
    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    @Override
    public String login(HttpServletRequest request,String username, String password) {
        //判断用户名或密码是否为空，如果为空，给出错误提示
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResultJSON.error(10011, "用户名和密码不能为空");
        }
        //根据用户名和密码去数据库查询用户对象
        SysUserInfo userInfo = sysUserInfoMapper.getUserInfoByUserNameAndPassword(username, password);
        //如果查询回来的userInfo不为空，说明账号和密码是正确的
        if (userInfo != null) {
            //把用户信息 存放到session作用域中
            request.getSession().setAttribute("userInfo", userInfo);
            return ResultJSON.success();
        }
        return ResultJSON.error(10012, "账号或密码错误");
    }
}
