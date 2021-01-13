package com.zzh.check.converter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

@Component
public class myBooleanFormatter implements Formatter<Boolean> {
    private final String[] data = {"是", "嗯"};


    @Override
    public Boolean parse(String s, Locale locale) throws ParseException {
        return Arrays.asList(data).contains(s);
    }

    @Override
    public String print(Boolean aBoolean, Locale locale) {
        return aBoolean ? "true" : "false";
    }
}
