package com.sindhup.restaurantlocator2;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserDAO {

	ArrayList<User> selectComments(int resID) throws SQLException;
}
