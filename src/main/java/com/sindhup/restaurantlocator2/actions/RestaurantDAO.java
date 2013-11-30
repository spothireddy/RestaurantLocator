package com.sindhup.restaurantlocator2.actions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface RestaurantDAO {

	
	ArrayList<Restaurant> selectPostcode(int postcode) throws SQLException;
	ArrayList<Restaurant> selectZipCus(int postcode, String cuisine) throws SQLException;
}
