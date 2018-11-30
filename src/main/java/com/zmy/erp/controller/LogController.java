package com.zmy.erp.controller;

import com.zmy.erp.domain.Log;
import com.zmy.erp.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;

    @RequestMapping("/add")
    public void add(@RequestParam(name = "userId") Long userId, @RequestParam(name = "message") String message){
        Log log = new Log(userId, message);
        logService.save(log);
    }

    @RequestMapping("/findByUserId")
    public Log findByUserId(@RequestParam(name = "userId") Long userId){
        return logService.findByUserId(userId);
    }
    @RequestMapping("/update")
    public void update(@RequestParam(name = "userId") Long userId, @RequestParam(name = "message") String message){
        Log log = new Log(userId, message);
        logService.save(log);
    }
    @RequestMapping("/deleteById")
    public void deleteById(@RequestParam(name = "userId") Long userId, @RequestParam(name = "message") String message){
        Log log = new Log(userId, message);
        logService.save(log);
    }
}