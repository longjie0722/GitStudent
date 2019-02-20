package com.java1824.util;

import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateContext implements Converter {
    @Override
    public <T> T convert(Class<T> aClass, Object o) {
        String s = (String) o;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            T date = (T) sdf.parse(s);
            return  date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
