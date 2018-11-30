package com.zmy.erp.mapper;

import com.zmy.erp.domain.Log;

public interface LogDao {

    public void save(Log log);

    public Log findByUserId(Long userId);

    public void update(Log log);

    public void deleteById(Long id);
}
