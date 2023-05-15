package com.play.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/15 8:57
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserInfo implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private String nickName;
    private String imgUrl;
    private Date createTime;
    private Integer status;
}
