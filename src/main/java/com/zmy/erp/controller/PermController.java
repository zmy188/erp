package com.zmy.erp.controller;

import com.zmy.erp.domain.Perm;
import com.zmy.erp.service.PermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perm")
public class PermController {

    @Autowired
    //@Qualifier("userServiceImpl")
    private PermService permService;

    @PostMapping("/add")
    public Integer add(@RequestBody Perm perm){
        return permService.insert(perm);
    }
}