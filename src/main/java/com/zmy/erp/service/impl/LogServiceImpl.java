package com.zmy.erp.service.impl;

import com.zmy.erp.domain.Log;
import com.zmy.erp.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Log log) {
        mongoTemplate.save(log);
    }

    @Override
    public Log findByUserId(Long userId) {
        Query query=new Query(Criteria.where("userId").is(userId));
        Log log =  mongoTemplate.findOne(query , Log.class);
        return log;
    }

    @Override
    public void update(Log log) {
//        Query query=new Query(Criteria.where("id").is(log.getId()));
//        Update update= new Update().set("userName", log.getUserName()).set("passWord", user.getPassWord());
//        //更新查询返回结果集的第一条
//        mongoTemplate.updateFirst(query,update,Log.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);
    }

    @Override
    public void deleteById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Log.class);
    }
}