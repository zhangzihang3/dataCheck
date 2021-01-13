package com.zzh.check.controller;


import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class baseController {
//    @InitBinder
//    public void bind(WebDataBinder webDataBinder) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
//        webDataBinder.setDisallowedFields("id");
//
//    }
}
