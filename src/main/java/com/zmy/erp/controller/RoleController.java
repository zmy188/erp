package com.zmy.erp.controller;

import com.zmy.erp.domain.Role;
import com.zmy.erp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/role")
public class RoleController {

   @Autowired
    //@Qualifier("roleServiceImpl")
    private RoleService roleService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("role/index");
        return mv;
    }

    @RequestMapping("/add")
    public Integer add(@RequestParam(name = "code") String code,
                       @RequestParam(name = "nameCn") String nameCn,
                       @RequestParam(name = "roleDescribe") String roleDescribe){
        Role role = new Role(code, nameCn, roleDescribe);
        return roleService.insert(role);
    }
}