package com.codeup.deimosspringblog.controllers;

//import com.codeup.deimosspringblog.models.Ad;
import com.codeup.deimosspringblog.models.User;
import com.codeup.deimosspringblog.models.Post;
import com.codeup.deimosspringblog.models.PostDetails;
import com.codeup.deimosspringblog.models.User;
import com.codeup.deimosspringblog.repositories.PostRepository;
import com.codeup.deimosspringblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.ArrayList;

@Controller
public class PostController {

    private PostRepository postDao;
    private UserRepository userDao;
    private EmailService emailService;

    public PostController(PostRepository postDao,
                          UserRepository userDao,
                          EmailService emailService) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @GetMapping("/posts")
    public String postsIndex(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}/edit")
    public String viewEditPostForm(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.getOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @RequestParam String title, @RequestParam String body) {
        Post p = new Post(
                id,
                title,
                body
        );
        postDao.save(p);
        return "redirect:/posts";
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id) {
        System.out.println("Does this run?");
        postDao.deleteById(id);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable long id, Model model) {
        model.addAttribute("title", postDao.getOne(id));
        return "posts/show";
    }


    @GetMapping("/posts/create")
    public String createPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }
    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        User u = userDao.getOne(1L);
        post.setUser(u);
        emailService.prepareAndSend(post, "HI there", "This is the test");
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("one/test")
    public String returnOneToViewOne(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "one-to-one-test";
    }

}
