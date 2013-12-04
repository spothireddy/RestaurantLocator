package com.sindhup.restaurantlocator2.actions;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.sindhup.restaurantlocator2.Restaurant;
import com.sindhup.restaurantlocator2.RestaurantDAOImpl;
import com.sindhup.restaurantlocator2.User;
import com.sindhup.restaurantlocator2.UserDAOImpl;

public class RestaurantAction extends ActionSupport implements ModelDriven<ArrayList<Restaurant>>, ServletContextAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
	Restaurant restaurant = new Restaurant();
	RestaurantDAOImpl restaurantDAO = new RestaurantDAOImpl();
	ArrayList<Restaurant> restaurantList  = new ArrayList<Restaurant>();
	ArrayList<Restaurant> commentList  = new ArrayList<Restaurant>();
	ArrayList<Restaurant> restaurantCuisineList = new ArrayList<Restaurant>();
	UserDAOImpl userDAO = new UserDAOImpl();
	ArrayList<User> userList = new ArrayList<User>();
	
	
	private int resID;
	
	public int getResID() {
		return resID;
	}



	public void setResID(int resID) {
		this.resID = resID;
	}



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
	
	public String info() throws SQLException{
		restaurantList = restaurantDAO.selectRestaurant(resID);
		restaurantCuisineList = restaurantDAO.selecCuisines(resID);
		userList = userDAO.selectComments(resID);
		return "success";
	}
	
	public String addComment() throws SQLException{
		this.setResID(Integer.parseInt(request.getParameter("resID")));
		restaurantList = restaurantDAO.selectRestaurant(resID);
		restaurantCuisineList = restaurantDAO.selecCuisines(resID);
		userDAO.addComments(Integer.parseInt(request.getParameter("resID")), request.getParameter("userName").toString()
				, request.getParameter("userComment").toString(), Integer.parseInt(request.getParameter("userRating")));
		userList = userDAO.selectComments(resID);
		return "success";
	}
	
	public String selectResName() throws SQLException{
		restaurantList  = new ArrayList<Restaurant>();
		restaurantList = restaurantDAO.selectResName(request.getParameter("name").toString());
		request.setAttribute("resList", restaurantList);

		return "success";
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}



	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}



	public ArrayList<Restaurant> getCommentList() {
		return commentList;
	}



	public void setCommentList(ArrayList<Restaurant> commentList) {
		this.commentList = commentList;
	}



	public ArrayList<Restaurant> getRestaurantCuisineList() {
		return restaurantCuisineList;
	}



	public void setRestaurantCuisineList(ArrayList<Restaurant> restaurantCuisineList) {
		this.restaurantCuisineList = restaurantCuisineList;
	}



	public UserDAOImpl getUserDAO() {
		return userDAO;
	}



	public void setUserDAO(UserDAOImpl userDAO) {
		this.userDAO = userDAO;
	}



	public ArrayList<User> getUserList() {
		return userList;
	}



	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}



	public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}



	public ArrayList<Restaurant> getRestaurantList(){
		return restaurantList;
	}

	public void setServletContext(ServletContext arg0) {
		request.setAttribute("resList", restaurantList);
		
	}


}
