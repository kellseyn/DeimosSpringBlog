package com.codeup.deimosspringblog.controllers;

import com.codeup.deimosspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")

    public String postsIndex(Model model){
        ArrayList<Post> postlist = new ArrayList<Post>();
        postlist.add(new Post(2, "title 2", "description 2"));
        postlist.add(new Post(3, "title 3", "description 3"));

        model.addAttribute("posts", postlist);

        return "posts/index";
    }


    @GetMapping("/posts/{id}")

    public String postId(@PathVariable long id, Model model){
        Post post1 = new Post(id, "Title 1", "Description 1");
        model.addAttribute("title", post1.getTitle());
        model.addAttribute("body", post1.getBody());
        return "posts/show";
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
