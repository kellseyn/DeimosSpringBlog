package com.codeup.deimosspringblog.repositories;

import com.codeup.deimosspringblog.models.Ads;
import com.codeup.deimosspringblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdRepository extends JpaRepository <Post, Long> {

    List<Post> findAll();

    Post findByTitle(String title);

    Post getFirstByTitle(String title);

    @Query("from Ads a where a.id like ?1")
    Post getAdById(long id);

    // The following method shows you how to use named params in a HQL custom query:
    @Query("from Ads a where a.title like %:term%")
    List<Ads> searchByTitleLike(@Param("term") String term);


}
