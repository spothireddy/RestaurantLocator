package com.sindhup.restaurantlocator2.actions;

public class Person {

	private String user;
	private String password;
	private String name;
	

	public Person(String user, String password, String name){
		this.user = user;
		this.password = password;
		this.name = name;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
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
	
	public String toString()
    {
        return "Name: " + getName() + "/n user: " + getUser() +
        		"/n Password: " + getPassword();
    }
	
}
