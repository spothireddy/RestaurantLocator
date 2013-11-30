package com.sindhup.restaurantlocator2.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sindhup.restaurantlocator2.extras.Person;

public class PersonAction extends ActionSupport implements ModelDriven{

	Person person =  new Person();
	ArrayList<Person> personList;
	public String execute() throws Exception{
		personList = new ArrayList<Person>();
		String ret = "error";
	      Connection conn = null;

	      try {
	         String URL = "jdbc:mysql://localhost/struts_tutorial";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "");
	         String sql = "SELECT * FROM login;";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery();
	         //ValueStack stack = ActionContext.getContext().getValueStack();
	        // Map<String, Object> context = new HashMap<String, Object>();

	         while(rs.next()){
	        	 Person p = new Person(rs.getString("user"), rs.getString("password"), rs.getString("name"));
	        	 personList.add(p);
	         }
	         
	         
	         ret = "success";
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
	
	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return person;
	}
	
}
