package com.play.mapper;

import com.play.entity.SysMenuInfo;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/12 9:45
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public interface SysMenuInfoMapper {
    /**
     * 新增系统菜单
     * @param sysMenuInfo 系统菜单对象
     * @return 0>受影响行数  添加成功
     */
    int addSysMenuInfo(SysMenuInfo sysMenuInfo);

    SysMenuInfo test();
}