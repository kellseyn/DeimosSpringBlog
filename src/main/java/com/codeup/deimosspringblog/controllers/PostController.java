package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody

    public String post(){
        return "These are all the posts";
    }


    @GetMapping("/posts/{id}")
    @ResponseBody

    public String postId(@PathVariable String id){
        return "This is the post at ID: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody

    public String createPostForm(){
        return "Create a post here!";
    }


    @PostMapping("/posts/create")
    @ResponseBody

    public String submitPost(){
        return "Here's the post you just created";
    }
}
