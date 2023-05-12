package com.play;

import com.alibaba.fastjson.JSON;
import com.play.entity.SysMenuInfo;
import com.play.entity.vo.SysMenuInfoTreeVO;
import com.play.mapper.SysMenuInfoMapper;
import com.play.service.SysMenuInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/12 9:59
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SysMenuInfoMapperTest {
    @Autowired
    private SysMenuInfoService sysMenuInfoService;

    @Autowired
    private SysMenuInfoMapper sysMenuInfoMapper;

    @Test
    public void addSysMenuInfo() {
        SysMenuInfo sysMenuInfo=new SysMenuInfo();
        sysMenuInfo.setName("businessInfoAudit");
        sysMenuInfo.setTitle("审核商家");
        sysMenuInfo.setJump(null);
        sysMenuInfo.setIcon("businessInfoAudit.png");
        sysMenuInfo.setLevel(2);
        sysMenuInfo.setPId(1);
        sysMenuInfo.setCreateUser(null);
        int rows = sysMenuInfoService.addSysMenuInfo(sysMenuInfo);
        System.out.println(rows > 0 ? "添加成功" : "添加失败");
    }

    @Test
    public void getSysMenuInfoByPid(){
//        sysMenuInfoMapper.getSysMenuInfoByPid(null).forEach(System.out::println);
        List<SysMenuInfoTreeVO> sysMenuInfoTreeVOS = assembleSysMenuInfo(null);
        sysMenuInfoTreeVOS.forEach(System.out::println);

        System.out.println(JSON.toJSONString(sysMenuInfoTreeVOS));
    }

    private List<SysMenuInfoTreeVO> assembleSysMenuInfo(Integer pId){
        List<SysMenuInfoTreeVO> sysMenuInfoByPid = sysMenuInfoMapper.getSysMenuInfoByPid(pId);
        sysMenuInfoByPid.forEach(sysMenuInfoTreeVO -> {
            sysMenuInfoTreeVO.setList(assembleSysMenuInfo(sysMenuInfoTreeVO.getId()));
        });
        return sysMenuInfoByPid;
    }
}
