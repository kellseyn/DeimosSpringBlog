package com.codeup.deimosspringblog.models;

import javax.persistence.*;

@Entity
public class Dog {

    @Id
    @Column(columnDefinition = "int(11) unsigned")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "tinyint(3) unsigned NOT NULL UNIQUE KEY")
    private int age;
    @Column(nullable = false, length = 200)
    private String name;
    @Column(columnDefinition = "char(2) default 'XX'")
    private String resideState;



    public Dog(int age, String name, String resideState) {
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }



    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }


}

