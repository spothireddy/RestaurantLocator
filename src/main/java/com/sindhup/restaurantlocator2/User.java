package com.sindhup.restaurantlocator2;

public class User {

	//Users(resID, commentID, userName, comment, rating)
	
	private int resID;
	private int commentID;
	private String userName;
	private String userComment;
	private int userRating;
	
	public int getResID() {
		return resID;
	}
	public void setResID(int resID) {
		this.resID = resID;
	}
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userCcomment) {
		this.userComment = userCcomment;
	}
	public int getUserRating() {
		return userRating;
	}
	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}
	
	
	
	
}
