package com.play.controller;

import com.play.service.SysMenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/12 9:48
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Controller
public class SysMenuInfoController {

    @Autowired
    private SysMenuInfoService sysMenuInfoService;

    @RequestMapping("/getSysMenuInfo")
    @ResponseBody
    public String showSysMenuInfo(){
        return sysMenuInfoService.getSysMenuInfo();
    }
}
