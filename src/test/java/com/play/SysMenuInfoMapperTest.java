package com.play;

import com.play.entity.SysMenuInfo;
import com.play.service.SysMenuInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void addSysMenuInfo() {
        SysMenuInfo sysMenuInfo=new SysMenuInfo();
        sysMenuInfo.setName("businessManage");
        sysMenuInfo.setTitle("商家管理");
        sysMenuInfo.setJump(null);
        sysMenuInfo.setIcon("businessManage.png");
        sysMenuInfo.setLevel(1);
        sysMenuInfo.setPId(null);
        sysMenuInfo.setCreateUser(null);
        int rows = sysMenuInfoService.addSysMenuInfo(sysMenuInfo);
        System.out.println(rows > 0 ? "添加成功" : "添加失败");
    }

    @Test
    public void test(){
        System.out.println(sysMenuInfoService.test());
    }
}
