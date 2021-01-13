package com.zzh.check.converter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.util.Set;

//TODO
public class myAnnotationFormatter implements AnnotationFormatterFactory<myAnnotationFormatter>, Annotation {
    @Resource
    myBooleanFormatter myBooleanFormatter;

    @Override
    public Set<Class<?>> getFieldTypes() {
        return null;
    }

    @Override
    public Printer<?> getPrinter(myAnnotationFormatter myAnnotationFormatter, Class<?> aClass) {
        return myBooleanFormatter;
    }

    @Override
    public Parser<?> getParser(myAnnotationFormatter myAnnotationFormatter, Class<?> aClass) {
        return myBooleanFormatter;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
