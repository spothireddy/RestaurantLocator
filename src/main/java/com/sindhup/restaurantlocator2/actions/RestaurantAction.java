package com.sindhup.restaurantlocator2.actions;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RestaurantAction extends ActionSupport implements ModelDriven<Restaurant>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
	Restaurant restaurant = new Restaurant();
	RestaurantDAOImpl restaurantDAO = new RestaurantDAOImpl();
	ArrayList<Restaurant> restaurantList  = new ArrayList<Restaurant>();
	
	public String execute() throws Exception{
		return "success";
	}
	
	public Restaurant getModel() {
		return restaurant;
	}
	
	public String selectZipcode() throws NumberFormatException, SQLException{
		restaurantList  = new ArrayList<Restaurant>();
		restaurantList = restaurantDAO.selectPostcode(Integer.parseInt(request.getParameter("postcode")));
		return "success";
	}
	
	public String selectZipCus() throws NumberFormatException, SQLException{
		restaurantList  = new ArrayList<Restaurant>();
		restaurantList = restaurantDAO.selectZipCus(Integer.parseInt(request.getParameter("postcode")), 
				request.getParameter("cuisine"));
		return "success";
	}
	
	public ArrayList<Restaurant> getRestaurantList(){
		return restaurantList;
	}

}
