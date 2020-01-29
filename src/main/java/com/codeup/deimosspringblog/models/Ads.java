package com.codeup.deimosspringblog.models;

import javax.persistence.*;

@Entity
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(100) NOT NULL")
    private String title;
    @Column(columnDefinition = "VARCHAR(300) NOT NULL")
    private String body;



    public Ads(){

    }

    public Ads(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBody(){
        return this.body;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setBody(String newBody){
        this.body = newBody;
    }
}