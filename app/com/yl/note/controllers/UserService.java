package com.yl.note.controllers;

import com.avaje.ebean.Ebean;
import com.yl.note.models.User;
import play.Logger;
import play.data.Form;
import play.data.validation.Constraints;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by lixiaofei on 2015/9/5.
 */
public class UserService extends Controller {

    public Result createUser(){

        Form<Register> registerForm = Form.form(Register.class).bindFromRequest();

        if (registerForm.hasErrors()) {
            return badRequest(registerForm.errorsAsJson());
        }

        Register registerUser = registerForm.get();


        if(User.findByEmail(registerUser.email) != null){
            return badRequest("用户已经存在.");
        }else {
            User user = new User();
            user.name = registerUser.name;
            user.email = registerUser.email;
            user.password = registerUser.password;
            user.save();
            return ok("success");
        }

//        user.sa
    }

    public Result getUserList() {

        return ok(Json.toJson(Ebean.find(User.class).findList()));
    }

    public Result login(){

        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            return badRequest(loginForm.errorsAsJson());
        }
        
        Login userInfo = loginForm.get();

        User user = User.login(userInfo.email, userInfo.password);
        if (user != null){
            session().clear();
            session("email", userInfo.email);
            Logger.debug("Login successfully, Email:" + userInfo.email);
            return ok(Json.toJson(user)); // return with {username:}
        }
        return badRequest("Invalid username or password");

    }


    public static class Login {

        @Constraints.Required
        @Constraints.Email
        public String email;


        @Constraints.Required
        public String password;
    }

    public static class Register {

        @Constraints.Required
        @Constraints.Email
        public String email;

        @Constraints.Required
        public String name;

        @Constraints.Required
        public String password;


        public String toString(){
            StringBuilder sBuilder = new StringBuilder();
            sBuilder.append("email:	"+email+"\n");
            sBuilder.append("name:	"+name+"\n");
            return sBuilder.toString();
        }

    }
}
