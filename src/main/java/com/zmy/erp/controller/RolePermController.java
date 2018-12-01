package com.zmy.erp.controller;

import com.zmy.erp.domain.RolePerm;
import com.zmy.erp.domain.req.RolePermReq;
import com.zmy.erp.service.RolePermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rolePerm")
public class RolePermController {
    @Autowired
    //@Qualifier("userServiceImpl")
    private RolePermService rolePermService;

    @PostMapping("/add")
    public Integer add(@RequestBody RolePermReq userRoleReq){
        Long[] permIds = userRoleReq.getPermIds();
        for (Long permId : permIds){
            RolePerm rolePerm = new RolePerm(userRoleReq.getRoleId(),permId);
            rolePermService.insert(rolePerm);
        }
        return 0;
    }
}