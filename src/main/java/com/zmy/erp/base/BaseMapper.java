package com.zmy.erp.base;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
    public Integer insert(T t);

    public Integer deleteOne(Long id);

    public Integer updateOne(T t);

    public Integer updateById(Long id, String loginName, String loginPwd);

    public T findById(Long id);

    public List<T> findAllList();

    public T findOneByArgs(Map<String, Object> map);

    public List<T> findByArgs(Map<String, Object> map);

    public List<T> findByPage(Map<String, Object> map);

    //public List<T> findByPage(BaseQuery baseQuery,String invokeMethod);

   // public Integer findByCount(String str);

    //public List<T> findAllByObject(Object object);

}
