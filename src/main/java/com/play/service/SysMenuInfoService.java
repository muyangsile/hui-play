package com.play.service;

import com.play.comment.ResultJSON;
import com.play.entity.SysMenuInfo;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/12 9:47
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public interface SysMenuInfoService {
    int addSysMenuInfo(SysMenuInfo sysMenuInfo);
    String getSysMenuInfo(HttpServletRequest request);
}
