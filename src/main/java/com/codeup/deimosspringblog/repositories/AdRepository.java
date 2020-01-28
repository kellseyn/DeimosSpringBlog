package com.codeup.deimosspringblog.repositories;

import com.codeup.deimosspringblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdRepository extends JpaRepository <Post, String> {

    List<Post> findAll();

    Post findByTitle(String title);


}
