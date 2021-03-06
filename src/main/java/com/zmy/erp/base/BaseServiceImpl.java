//package com.zmy.erp.base;
//
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//
//import java.util.List;
//import java.util.Map;
//
////@Service
//public abstract class BaseServiceImpl<T> implements BaseService<T> {
//    private static final Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);
//
//    @Autowired
//    private BaseMapper<T> baseMapper;
//
//    @Override
//    public Integer insert(T t) {
//        return baseMapper.insert(t);
//    }
//
//    @Override
//    //如果指定为 true，则方法调用后将立即清空所有缓存
//    @CacheEvict(cacheNames = {"user"}, key ="#p0",allEntries=true)
//    public Integer deleteOne(Long id) {
//        return baseMapper.deleteOne(id);
//    }
//
//    @Override
//    public Integer updateOne(T t) {
//        return baseMapper.updateOne(t);
//    }
//
//    @Override
//    @CachePut(cacheNames = {"user"}, key = "#p0")
//    public T updateById(Long id, String loginName, String loginPwd) {
//        baseMapper.updateById(id, loginName, loginPwd);
//        return baseMapper.findById(id);
//    }
//
//    @Override
//    //@Cacheable //开启缓存
//    //@Cacheable(cacheNames = {"findById"})
//    @Cacheable(cacheNames = {"user"}, key ="#p0")
//    public T findById(Long id) {
//        log.info("进入 findById 方法");
//        return baseMapper.findById(id);
//    }
//
//    @Override
//    public List<T> findAllList() {
//        return baseMapper.findAllList();
//    }
//
//
//    @Override
//    public T findOneByArgs(Map<String, Object> map) {
//        return baseMapper.findOneByArgs(map);
//    }
//
//    @Override
//    public List<T> findByArgs(Map<String, Object> map) {
//        return baseMapper.findByArgs(map);
//    }
//
//    @Override
//    public PageInfo<T> findByPage(Map<String, Object> map) {
//        int pageNumber = 1;
//        int pageSize = 2;
//        if (map.containsKey("pageNumber")){
//            pageNumber = (int)map.get("pageNumber");
//        }
//        if (map.containsKey("pageSize")){
//            pageSize = (int)map.get("pageSize");
//        }
//        PageHelper.startPage(pageNumber, pageSize);
//        List<T> books = baseMapper.findByPage(map);
//        PageInfo<T> pageInfo = new PageInfo<>(books);
//        return pageInfo;
//    }
//}
