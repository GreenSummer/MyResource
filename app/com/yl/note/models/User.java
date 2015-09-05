package com.yl.note.models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lixiaofei on 2015/9/4.
 */
@Entity(name="user")
public class User extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(nullable = false, length = 100)
    public String name;

    @Column(nullable = false, length = 100,unique = true)
    public String email;

    @JsonIgnore
    @Column(nullable = false, length = 100)
    public String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    public List<Tag> tagList;

    public static Finder<Integer,User> find = new Finder<Integer,User>(Integer.class, User.class);

    public static User login(String email,String pwd){
        User user = find.where().eq("email", email).eq("password", pwd).findUnique();
        if(user != null){
            return user;
        }

        return null;
    }


    public static User findByEmail(String email){
        User user = find.where().eq("email", email).findUnique();
        if(user != null){
            return user;
        }
        return null;
    }
}
