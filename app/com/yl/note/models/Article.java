package com.yl.note.models;

import javax.persistence.*;

/**
 * Created by lixiaofei on 2015/9/5.
 */
@Entity(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(nullable = false, length = 20)
    public String title;

    @Lob
    @Column(nullable = false)
    public String content;
}
