package com.zmy.erp.service;

import com.zmy.erp.domain.Log;

public interface LogService {
    public void save(Log log);

    public Log findByUserId(Long userId);

    public void update(Log log);

    public void deleteById(Long id);
}
