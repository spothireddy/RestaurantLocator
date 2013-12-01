package com.sindhup.restaurantlocator2.actions;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.sindhup.restaurantlocator2.Restaurant;
import com.sindhup.restaurantlocator2.RestaurantDAOImpl;

public class RestaurantAction extends ActionSupport implements ModelDriven<ArrayList<Restaurant>>, ServletContextAware{

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
	
	public ArrayList<Restaurant> getModel() {
		return restaurantList;
	}
	
	public String selectZipcode() throws NumberFormatException, SQLException{
		restaurantList  = new ArrayList<Restaurant>();
		restaurantList = restaurantDAO.selectPostcode(Integer.parseInt(request.getParameter("postcode")));
		request.setAttribute("resList", restaurantList);

		return "success";
	}
	
	public String selectZipCus() throws NumberFormatException, SQLException{
		restaurantList  = new ArrayList<Restaurant>();
		restaurantList = restaurantDAO.selectZipCus(Integer.parseInt(request.getParameter("postcode")), 
				request.getParameter("cuisine"));
		request.setAttribute("resList", restaurantList);
		return "success";
	}
	
	public String testMap() throws NumberFormatException, SQLException{
		restaurantList  = new ArrayList<Restaurant>();
		restaurantList = restaurantDAO.selectPostcode(Integer.parseInt(request.getParameter("postcode")));
		request.setAttribute("resList", restaurantList);
		return "success";

	}
	public ArrayList<Restaurant> getRestaurantList(){
		return restaurantList;
	}

	public void setServletContext(ServletContext arg0) {
		request.setAttribute("resList", restaurantList);
		
	}


}
