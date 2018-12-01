package com.zmy.erp.controller;

import com.zmy.erp.domain.UserRole;
import com.zmy.erp.domain.req.UserRoleReq;
import com.zmy.erp.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {

    @Autowired
    //@Qualifier("userServiceImpl")
    private UserRoleService userRoleService;

    @PostMapping("/add")
    public Integer add(@RequestBody UserRoleReq userRoleReq){
        Long[] roleIds = userRoleReq.getRoleIds();
        for (Long roleId : roleIds){
            UserRole userRole = new UserRole(userRoleReq.getUserId(), roleId);
            userRoleService.insert(userRole);
        }
        return 0;
    }
}