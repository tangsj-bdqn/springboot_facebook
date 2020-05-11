package com.hfxt.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/index.html")
    public String index() {

        return "ni hao";
    }


    @RequestMapping("/index2.html")
    public String index2(Model model) {

        model.addAttribute("date", new Date());

        return "now";
    }


}
