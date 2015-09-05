
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/workspace_self/note-play/conf/routes
// @DATE:Sat Sep 05 11:58:38 CST 2015

package com.yl.note.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final com.yl.note.controllers.ReverseUserService UserService = new com.yl.note.controllers.ReverseUserService(RoutesPrefix.byNamePrefix());
  public static final com.yl.note.controllers.ReverseTagService TagService = new com.yl.note.controllers.ReverseTagService(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final com.yl.note.controllers.javascript.ReverseUserService UserService = new com.yl.note.controllers.javascript.ReverseUserService(RoutesPrefix.byNamePrefix());
    public static final com.yl.note.controllers.javascript.ReverseTagService TagService = new com.yl.note.controllers.javascript.ReverseTagService(RoutesPrefix.byNamePrefix());
  }

}
