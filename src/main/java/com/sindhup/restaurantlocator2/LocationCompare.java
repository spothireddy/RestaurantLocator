package com.sindhup.restaurantlocator2;

import java.util.Comparator;

public class LocationCompare implements Comparator{

	 public int compare(Object o1, Object o2) {
			int returnFlg=1;

			AffinityLocation location,location1;
			location =(AffinityLocation) o1;
			location1 =(AffinityLocation) o2;

			if (location.getDistance()==null) {
		  	return returnFlg;	}

			returnFlg=location.getDistance().compareTo(location1.getDistance());
			if (returnFlg==-1) {
		  	return returnFlg;
			}else if(returnFlg==0){
		   	//return  location.getResID().compareTo(location1.getResID());
			}
			return returnFlg;

		  }
		  public boolean equals(Object obj) {
		   return obj.equals(this);
		   
		  }

}
