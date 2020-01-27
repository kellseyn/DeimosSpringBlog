package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody

    public int add(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }


    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody

    public int subtract(@PathVariable int num1, @PathVariable int num2){
        return  num2 - num1;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody

    public int multiply(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }


    @GetMapping("/divide/{num2}/by/{num1}")
    @ResponseBody

    public int divide(@PathVariable int num1, @PathVariable int num2) throws ArithmeticException{
        if(num1 == 0){
            throw new ArithmeticException("You cannot divide a number by 0");
        }else{

        return  num2 / num1;
        }
    }
}
