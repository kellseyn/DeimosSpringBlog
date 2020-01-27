package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody

    public String post(){
        return "These are all the posts";
    }


//    @GetMapping("/posts/{id}", method = RequestMethod.GET)
//    @ResponseBody
//
//    public String postId(@PathVariable String id){
//        return "These are all the posts";
//    }
//
//    @GetMapping("/posts/create", method = RequestMethod.GET)
//    @ResponseBody
//
//    public String postCreate(){
//        return "Create a post here!";
//    }
//
//
//    @GetMapping("/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//
//    public String postCreate(){
//        return "Here's the post you just created";
//    }
}
