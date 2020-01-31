//package com.codeup.deimosspringblog.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "post_images")
//public class PostImage {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @Column(columnDefinition = "VARCHAR(100) NOT NULL")
//    private String image_title;
//    @Column(columnDefinition = "VARCHAR(1000) NOT NULL")
//    private String url;
////    @ManyToOne
////    @JoinColumn(name = "post_id", nullable = false)
////    private Post post;
//
//
//
//    public PostImage(String image_title, String url)
////    , Post post)
//    {
//        this.image_title = image_title;
//        this.url = url;
////        this.post = post;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getImage_title() {
//        return image_title;
//    }
//
//    public void setImage_title(String image_title) {
//        this.image_title = image_title;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//}
