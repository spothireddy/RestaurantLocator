package com.sindhup.restaurantlocator2.actions;

import java.io.Serializable;

public class Restaurant implements Serializable{

	private int resID;
	private String name;
	private String address;
	private String locality;
	private int postcode;
	private double latitude;
	private double longitude;
	private String tel;
	private String website;
	private double rating;
	private String cuisine;
	
	
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getResID() {
		return resID;
	}
	public void setResID(int resID) {
		this.resID = resID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + resID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		if (resID != other.resID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Restaurant [resID=" + resID + ", name=" + name + ", address="
				+ address + ", locality=" + locality + ", postcode=" + postcode
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", tel=" + tel + ", website=" + website + ", rating="
				+ rating + ", cuisine=" + cuisine + "]";
	}
	
	
}
