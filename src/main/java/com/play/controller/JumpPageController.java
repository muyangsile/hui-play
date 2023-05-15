package com.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/5/15 11:43
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
@Controller
@RequestMapping("/jump")
public class JumpPageController {
    @RequestMapping("/welcome")
    public String welcomePage(){
        return "welcome";
    }
}
