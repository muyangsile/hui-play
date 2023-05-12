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
 * @Date: 2023/5/12 9:43
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysMenuInfo  implements Serializable {
    private Integer id;
    private String name;
    private String title;
    private String jump;
    private String icon;
    private Integer level;
    private Integer pId;
    private Date createTime;
    private Integer createUser;
    private Integer status;
}
