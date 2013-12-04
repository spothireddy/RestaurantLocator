package com.sindhup.restaurantlocator2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO{

	private Connection connection;
    private Statement statement;
    
	public ArrayList<User> selectComments(int resID) throws SQLException {
		String query = "SELECT * FROM users WHERE resID= " + resID;
        ResultSet rs = null;
        User user = null;
        ArrayList<User> arrUser = new ArrayList<User>();
        
        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()) {
                user = new User();
                user.setRating(rs.getInt("rating"));
                user.setResID(rs.getInt("resID"));
                user.setUserName(rs.getString("userName"));
                user.setComment(rs.getString("comment"));
                user.setCommentID(rs.getInt("commentID"));
                arrUser.add(user);

            }
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
        return arrUser;
	}
	
	
	public ArrayList<User> addComments(int resID, String name, String comment, int rating) throws SQLException {
		String query = "SELECT * FROM users WHERE resID= " + resID;
        ResultSet rs = null;
        User user = null;
        ArrayList<User> arrUser = new ArrayList<User>();
        
        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()) {
                user = new User();
                user.setRating(rs.getInt("rating"));
                user.setResID(rs.getInt("resID"));
                user.setUserName(rs.getString("userName"));
                user.setComment(rs.getString("comment"));
                user.setCommentID(rs.getInt("commentID"));
                arrUser.add(user);

            }
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
        return arrUser;
	}

}