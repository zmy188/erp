package com.zmy.erp.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
@Component
public class TimestampConverter implements Converter<Date, Timestamp> {
    /**
     * Timestamp转换器
     * 将Date转换成Timestamp
     * @ClassName: TimestampConverter
     * @Description: TODO
     * @author 笨笨
     * @date 2015年8月10日 下午4:45:19
     *
     */
    @Override
    public Timestamp convert(Date date) {
        if(date != null){
            return new Timestamp(date.getTime());
        }
        return null;
    }
}