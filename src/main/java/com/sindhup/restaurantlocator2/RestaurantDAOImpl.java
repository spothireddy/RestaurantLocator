package com.sindhup.restaurantlocator2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class RestaurantDAOImpl implements RestaurantDAO {

	private Connection connection;
    private Statement statement;
    
	public RestaurantDAOImpl(){
		
	}
	
	public ArrayList<Restaurant> selectPostcode(int postcode) throws SQLException{
		 String query = "SELECT * FROM restaurant WHERE postcode=" + postcode;
	        ResultSet rs = null;
	        Restaurant res = null;
	        ArrayList<Restaurant> arrRes = new ArrayList<Restaurant>();
	        
	        try {
	            connection = ConnectionFactory.getConnection();
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            while(rs.next()) {
	                res = new Restaurant();
	                res.setAddress(rs.getString("address"));
	                res.setLatitude(rs.getDouble("latitude"));
	                res.setLocality(rs.getString("locality"));
	                res.setLongitude(rs.getDouble("longitude"));
	                res.setName(rs.getString("name"));
	                res.setPostcode(rs.getInt("postcode"));
	                res.setRating(rs.getDouble("rating"));
	                res.setResID(rs.getInt("resID"));
	                res.setTel(rs.getString("tel"));
	                res.setWebsite(rs.getString("website"));
	                
	                arrRes.add(res);

	            }
	        } finally {
	            DbUtil.close(rs);
	            DbUtil.close(statement);
	            DbUtil.close(connection);
	        }
	        return arrRes;
	    }

	public ArrayList<Restaurant> selectZipCus(int postcode, String cuisine)
			throws SQLException {
		 String query = "select * from restaurant where resID in (select resID from restaurant_materialized where postcode = '"+ 
			postcode +"' and cuisine like '" + cuisine + "');";
	        ResultSet rs = null;
	        Restaurant res = null;
	        ArrayList<Restaurant> arrRes = new ArrayList<Restaurant>();
	        
	        try {
	            connection = ConnectionFactory.getConnection();
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            while(rs.next()) {
	                res = new Restaurant();
	                res.setAddress(rs.getString("address"));
	                res.setLatitude(rs.getDouble("latitude"));
	                res.setLocality(rs.getString("locality"));
	                res.setLongitude(rs.getDouble("longitude"));
	                res.setName(rs.getString("name"));
	                res.setPostcode(rs.getInt("postcode"));
	                res.setRating(rs.getDouble("rating"));
	                res.setResID(rs.getInt("resID"));
	                res.setTel(rs.getString("tel"));
	                res.setWebsite(rs.getString("website"));
	                
	                arrRes.add(res);

	            }
	        } finally {
	            DbUtil.close(rs);
	            DbUtil.close(statement);
	            DbUtil.close(connection);
	        }
	        return arrRes;
	}
	
	public ArrayList<Restaurant> selectRestaurant(int resID)
			throws SQLException {
		 String query = "select * from restaurant where resID = " + resID;
	        ResultSet rs = null;
	        Restaurant res = null;
	        ArrayList<Restaurant> arrRes = new ArrayList<Restaurant>();
	        try {
	            connection = ConnectionFactory.getConnection();
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            while(rs.next()) {
	                res = new Restaurant();
	                res.setAddress(rs.getString("address"));
	                res.setLatitude(rs.getDouble("latitude"));
	                res.setLocality(rs.getString("locality"));
	                res.setLongitude(rs.getDouble("longitude"));
	                res.setName(rs.getString("name"));
	                res.setPostcode(rs.getInt("postcode"));
	                res.setRating(rs.getDouble("rating"));
	                res.setResID(rs.getInt("resID"));
	                res.setTel(rs.getString("tel"));
	                res.setWebsite(rs.getString("website"));
	                
	                arrRes.add(res);

	            }
	        } finally {
	            DbUtil.close(rs);
	            DbUtil.close(statement);
	            DbUtil.close(connection);
	        }
	        return arrRes;
	}
	
	public ArrayList<Restaurant> selecCuisines(int resID) throws SQLException{
		 String query = "SELECT cuisine FROM restaurant_materialized WHERE resID=" + resID;
	        ResultSet rs = null;
	        Restaurant res = null;
	        ArrayList<Restaurant> arrCus = new ArrayList<Restaurant>();
	        
	        try {
	            connection = ConnectionFactory.getConnection();
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            while(rs.next()) {
	                res = new Restaurant();
	                res.setResID(resID);
	                res.setCuisine(rs.getString("cuisine"));
	                
	                arrCus.add(res);

	            }
	        } finally {
	            DbUtil.close(rs);
	            DbUtil.close(statement);
	            DbUtil.close(connection);
	        }
	        return arrCus;
	    }
}

	
	

