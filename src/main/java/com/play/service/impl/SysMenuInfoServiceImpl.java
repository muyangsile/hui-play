package com.play.service.impl;

import com.alibaba.fastjson.JSON;
import com.play.comment.ResultJSON;
import com.play.entity.SysMenuInfo;
import com.play.entity.SysUserInfo;
import com.play.entity.vo.SysMenuInfoTreeVO;
import com.play.mapper.SysMenuInfoMapper;
import com.play.service.SysMenuInfoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/12 9:47
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Service
public class SysMenuInfoServiceImpl implements SysMenuInfoService {
    @Autowired
    private SysMenuInfoMapper sysMenuInfoMapper;

    @Override
    public int addSysMenuInfo(SysMenuInfo sysMenuInfo) {
        return sysMenuInfoMapper.addSysMenuInfo(sysMenuInfo);
    }

    @Override
    public String getSysMenuInfo(HttpServletRequest request) {
        Map<String, Object> menuMap = new HashMap<>();
        Map<String, Object> homeInfo = new HashMap<>();
        homeInfo.put("title", "首页");
        homeInfo.put("href", "jump/welcome");
        Map<String, Object> logoInfo = new HashMap<>();
        logoInfo.put("title", "惠玩儿后台管理");
        logoInfo.put("image", "static/images/logo.png");
        logoInfo.put("href", "");
        menuMap.put("homeInfo", homeInfo);
        menuMap.put("logoInfo", logoInfo);
        //拿到登录成功之后的用户信息，从而获取他的用户ID
        SysUserInfo userInfo = (SysUserInfo) request.getSession().getAttribute("userInfo");
        List<SysMenuInfoTreeVO> menuInfos = assembleSysMenuInfo(userInfo.getId(),null);
        menuMap.put("menuInfo", menuInfos);
//        return ResultJSON.success(menuMap);
        return JSON.toJSONString(menuMap);
    }

    /**
     * 拼装菜单方法
     *
     * @return
     */
    private List<SysMenuInfoTreeVO> assembleSysMenuInfo(Integer pId) {
        List<SysMenuInfoTreeVO> sysMenuInfoByPid = sysMenuInfoMapper.getSysMenuInfoByPid(pId);
        sysMenuInfoByPid.forEach(sysMenuInfoTreeVO -> {
            sysMenuInfoTreeVO.setChild(assembleSysMenuInfo(sysMenuInfoTreeVO.getId()));
        });
        return sysMenuInfoByPid;
    }

    private List<SysMenuInfoTreeVO> assembleSysMenuInfo(Integer userId, Integer pId) {
        List<SysMenuInfoTreeVO> sysMenuInfoByPid = sysMenuInfoMapper.getSysMenuInfoByUserIdAndPid(userId, pId);
        sysMenuInfoByPid.forEach(sysMenuInfoTreeVO -> {
            sysMenuInfoTreeVO.setChild(assembleSysMenuInfo(userId, sysMenuInfoTreeVO.getId()));
        });
        return sysMenuInfoByPid;
    }
}
