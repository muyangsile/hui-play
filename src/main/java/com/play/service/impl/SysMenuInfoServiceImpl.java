package com.play.service.impl;

import com.play.entity.SysMenuInfo;
import com.play.mapper.SysMenuInfoMapper;
import com.play.service.SysMenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public SysMenuInfo test() {
        return sysMenuInfoMapper.test();
    }
}
