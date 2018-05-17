
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 18:18:44 BST 2018

package controllers.admin.db;

import admin.RoutesPrefix;

public class routes {
  
  public static final controllers.admin.db.ReverseWidgets Widgets = new controllers.admin.db.ReverseWidgets(RoutesPrefix.byNamePrefix());
  public static final controllers.admin.db.ReverseIndexC IndexC = new controllers.admin.db.ReverseIndexC(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.admin.db.javascript.ReverseWidgets Widgets = new controllers.admin.db.javascript.ReverseWidgets(RoutesPrefix.byNamePrefix());
    public static final controllers.admin.db.javascript.ReverseIndexC IndexC = new controllers.admin.db.javascript.ReverseIndexC(RoutesPrefix.byNamePrefix());
  }

}
