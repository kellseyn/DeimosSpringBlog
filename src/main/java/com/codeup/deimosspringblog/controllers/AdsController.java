package com.codeup.deimosspringblog.controllers;

import com.codeup.deimosspringblog.models.Post;
import com.codeup.deimosspringblog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdsController {

    private AdRepository adsDao;

    public AdsController(AdRepository adsDao){
        this.adsDao = adsDao;
    }

    @GetMapping("/ads")
    public String allAds(){
        return ("posts/index");
    }


    @GetMapping("/ads/all")
    @ResponseBody
    public List<Post> returnPosts(){
        return adsDao.findAll();
    }

    @GetMapping("/ads/bytitle")
    public Post byTitle(){
        return adsDao.findByTitle("k");
    }

    @GetMapping("/ads/firstbytitle")
    public String firstTitle(){
        return "test";
    }
}
