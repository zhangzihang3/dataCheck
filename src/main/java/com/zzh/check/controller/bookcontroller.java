package com.zzh.check.controller;

import com.zzh.check.entry.book;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class bookcontroller extends baseController{
    @RequestMapping(value = "/book")
    public String a() {
        return "book";
    }

//    @ResponseBody
//    @RequestMapping(value = "/bookDo", produces = "application/json"
//            , consumes = "application/x-www-form-urlencoded",
//            method = RequestMethod.POST)
//    public book bookDo(book book) {
//        return book;
//    }



    @RequestMapping(value = "/bookDo",
            method = RequestMethod.POST)
    public String bookDo(book book) {
        return "book";
    }


    @RequestMapping(value = "/date",
            method = RequestMethod.POST)
    public String date(Date date, Model model) {
        model.addAttribute("date", date);
        return "book";
    }

    @RequestMapping(value = "/boolean",
            method = RequestMethod.POST)
    public String date2(boolean b, Model model) {
        model.addAttribute("boolean", b);
        return "book";
    }

    @InitBinder
    public void bind(WebDataBinder webDataBinder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
        webDataBinder.setDisallowedFields("id");

    }
}
