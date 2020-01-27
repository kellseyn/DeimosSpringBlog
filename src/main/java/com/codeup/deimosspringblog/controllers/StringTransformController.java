package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringTransformController {

    @GetMapping("/string/reverse/{string}")
    @ResponseBody

    public String reversed(@PathVariable String string){
        StringBuilder output = new StringBuilder(string).reverse();
        return output.toString();
    }


    @GetMapping("/string/uppercase/{string}")
    @ResponseBody

    public String upperCased(@PathVariable String string){
        return string.toUpperCase();
    }

    @GetMapping("/string/both/{string}")
    @ResponseBody

    public String both(@PathVariable String string){
        return upperCased(reversed(string));
    }

    @GetMapping("/string/{string}")
    @ResponseBody

    public String strang(@PathVariable String string,
                        @RequestParam(required = false) boolean reverse,
                         @RequestParam(required = false) boolean caps) {

        if(caps == true && reverse == true){
        return upperCased(reversed(string));
        } else if (caps == true) {
            return upperCased(string);
        }else if(reverse == true){
            return reversed(string);
        } else{
            return string;
        }
    }
}
