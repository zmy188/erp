package com.zmy.erp.service;

import com.zmy.erp.base.BaseService;
import com.zmy.erp.domain.User;
import org.springframework.stereotype.Service;

@Service
//@CacheConfig(cacheNames="users")
//@Cacheable将查询结果缓存到redis中，（key=”#p0”）指定传入的第一个参数作为redis的key。
//@CachePut，指定key，将更新的结果同步到redis中
//@CacheEvict，指定key，删除缓存数据，allEntries=true,方法调用后将立即清除缓存
public class UserService extends BaseService<User> {

}

