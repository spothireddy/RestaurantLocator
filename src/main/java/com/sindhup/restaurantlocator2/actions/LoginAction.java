package com.sindhup.restaurantlocator2.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction extends ActionSupport{

	
	private String user;
	   private String password;
	   private String name;

	   public String execute() {
	      String ret = "error";
	      Connection conn = null;

	      try {
	         String URL = "jdbc:mysql://localhost/struts_tutorial";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "");
	         String sql = "SELECT name FROM login WHERE";
	         sql+=" user = ? AND password = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, user);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();
	         //ValueStack stack = ActionContext.getContext().getValueStack();
	        // Map<String, Object> context = new HashMap<String, Object>();

	         
	         while (rs.next()) {
	            name = rs.getString(1);
	            //context.put("name", name);
		        // stack.push(context);
	            System.out.println("THE NAME IS: " + name);
	            ret = "success";
	         }
	      } catch (Exception e) {
	         ret = "error";
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      return ret;
	   }

	   public String getUser() {
	      return user;
	   }

	   public void setUser(String user) {
	      this.user = user;
	   }

	   public String getPassword() {
	      return password;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
