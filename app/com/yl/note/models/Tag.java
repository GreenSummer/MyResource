package com.yl.note.models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lixiaofei on 2015/9/5.
 */
@Entity(name = "tag")
public class Tag extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(nullable = false, length = 20)
    public String name;

    @Column(length = 100)
    public String description;

    @ManyToOne
    @JsonIgnore
    public User user;

    public static Finder<Integer,Tag> find = new Finder<Integer,Tag>(Integer.class, Tag.class);

    public static boolean isExisted(User user,String tagName){
        Tag tag = find.where().eq("user",user).eq("name",tagName).findUnique();

        if(tag != null)
            return true;
        return false;
    }

    public static List<Tag> listTags(User user){
        return  find.where().eq("user",user).findList();
    }
}
