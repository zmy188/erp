package com.zmy.erp.controller;

import com.zmy.erp.domain.User;
import com.zmy.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/index")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("user/index");
        return mv;
    }

    @RequestMapping("/add")
    public Integer add(@RequestParam(name = "loginName") String loginName, @RequestParam(name = "loginPwd") String loginPwd){
        User user = new User(loginName,loginPwd);
        return userService.insert(user);
    }

    @RequestMapping("/findById")
    public User findById(@RequestParam(name = "id") Long id ){
        return userService.findById(id);
    }

    @RequestMapping("/updateById")
    public User updateById(@RequestParam(name = "id") Long id, @RequestParam(name = "loginName") String loginName, @RequestParam(name = "loginPwd") String loginPwd ){
        return userService.updateById(id, loginName, loginPwd);
    }

    @RequestMapping("/deleteOne")
    public Integer deleteOne(@RequestParam(name = "id") Long id ){
        return userService.deleteOne(id);
    }
}