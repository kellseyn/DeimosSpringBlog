package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeimosController {

    @GetMapping("/deimos")

    public String countDown(){
        return "deimos";
    }

    @GetMapping("deimos/{days}")


    public String deimos(@PathVariable String days, Model model){
        model.addAttribute("days", days);
        return "deimos";
    }


}
