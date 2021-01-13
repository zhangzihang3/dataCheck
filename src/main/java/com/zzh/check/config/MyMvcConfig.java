package com.zzh.check.config;

import com.zzh.check.converter.myDateConverter;
import com.zzh.check.converter.myDateFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//使用可以来扩展SpringMVC的功能
//@EnableWebMvc   //不要接管SpringMVC

/**
 * @author 张子行
 * @class
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    /**
     * @method 添加Formatter
     * @param
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new myDateConverter());
        //registry.addFormatter(new myDateFormatter());

    }
    /**
     * @method 添加视图控制器
     * @param
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
