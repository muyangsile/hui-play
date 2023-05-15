package com.play.mapper;

import com.play.entity.SysUserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/15 9:31
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public interface SysUserInfoMapper {
    SysUserInfo getUserInfoByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
}
