package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeimosController {

    @GetMapping("/deimos")
    @ResponseBody

    public String deimos(){
        return "31 days to dev day!";
    }

    @GetMapping("deimos/{days}")
    @ResponseBody

    public String deimos(@PathVariable String days){
        return days + " days to dev day!";
    }
}
