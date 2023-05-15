package com.play.mapper;

import com.play.entity.SysMenuInfo;
import com.play.entity.vo.SysMenuInfoTreeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    List<SysMenuInfoTreeVO> getSysMenuInfoByPid(Integer pId);
    List<SysMenuInfoTreeVO> getSysMenuInfoByUserIdAndPid(@Param("userId") Integer userId, @Param("pId") Integer pId);
}
