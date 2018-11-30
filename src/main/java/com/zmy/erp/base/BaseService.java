package com.zmy.erp.base;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    public Integer insert(T t);

    public Integer deleteOne(Long id);

    public Integer updateOne(T t);

    public T updateById(Long id, String loginName, String loginPwd);

    public T findById(Long id);

    public List<T> findAllList();

    public T findOneByArgs(Map<String, Object> map);

    public List<T> findByArgs(Map<String, Object> map);

    public PageInfo<T> findByPage(Map<String, Object> map);
}
