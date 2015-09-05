package com.yl.note.controllers;

import com.yl.note.models.User;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Fly on 22/Sep/14 AD.
 */
public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
    	String email = null;
    	if(ctx.session().isEmpty()){
			return null;
		}else{

    		email = ctx.session().get("email");
    		User user = User.findByEmail(email);
			if(user == null){
                return null;
            }
    			ctx.args.put("user", user);
    	}
    	return email;
    }



//	private String getUser(Context ctx, Request request, AuthStrategy strategy) {
//		User user;
//		user = strategy.getUser(request);
//		if (user != null) {
//			ctx.args.put("user", user);
//			return user.getEmailAddress();
//		}
//		return null;
//	}

    @Override
    public Result onUnauthorized(Context ctx) {
    	System.out.println("Hi  bad, unauthorized");
//        return redirect(routes.SecurityController.login());
//    	redirect("/index.html");
        return unauthorized();
    }
}