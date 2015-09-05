package com.yl.note.controllers;

import com.yl.note.models.Tag;
import com.yl.note.models.User;
import play.Logger;
import play.data.Form;
import play.data.validation.Constraints;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by lixiaofei on 2015/9/5.
 */

@Security.Authenticated(Secured.class)
public class TagService extends Controller {

    public Result listTags() {
        User user = (User) Http.Context.current().args.get("user");
        Logger.debug("Get the user, user email:",user.email);
        return ok(Json.toJson(Tag.listTags(user)));
    }

    public Result addTag(){
        Form<TagForm> tagForm = Form.form(TagForm.class).bindFromRequest();

        if (tagForm.hasErrors()) {
            return badRequest(tagForm.errorsAsJson());
        }

        TagForm formInfo = tagForm.get();

        User user = (User) Http.Context.current().args.get("user");
        if(Tag.isExisted(user,formInfo.name)){
            return badRequest("此标签已经存在.");
        }

        Tag tag = new Tag();
        tag.name = formInfo.name;
        tag.description = formInfo.desc;
        tag.user = user;

        tag.save();

        return ok(Json.toJson(tag));


    }

    public static class TagForm {

        @Constraints.Required
        public String name;

        public String desc;
    }

}
