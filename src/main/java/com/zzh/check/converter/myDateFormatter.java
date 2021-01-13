package com.zzh.check.converter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author 张子行
 * @class
 */
//@Component
public class myDateFormatter implements Formatter<Date> {
    private SimpleDateFormat simpleDateFormat;

    public myDateFormatter() {
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * @param
     * @method 日期接收格式
     */
    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return simpleDateFormat.parse(s);
    }

    /**
     * @param
     * @method 日期对外输出格式
     */
    @Override
    public String print(Date date, Locale locale) {
        return simpleDateFormat.format(date);
    }
}
