package com.sindhup.restaurantlocator2;

import java.io.Serializable;

public class AffinityLocation implements Comparable, Serializable{

	private Integer resID;
	private Double distance;
	
	
	public int getResID() {
		return resID;
	}

	public void setResID(int resID) {
		this.resID = resID;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public AffinityLocation(){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		AffinityLocation other = (AffinityLocation) obj;
		if (Double.doubleToLongBits(distance) != Double
				.doubleToLongBits(other.distance))
			return false;
		if (resID != other.resID)
			return false;
		return true;
	}


	public int compareTo(Object o) {
		//  1 grater then Object
		// -1 smaller than Object
		// 0  equal to Object
		int returnFlg=1;
		if (!(o instanceof AffinityLocation)) return -1;
		AffinityLocation location= (AffinityLocation)o;

		if (location.getDistance() == null) {
			
	  	return returnFlg;	}
	    

		returnFlg=distance.compareTo(location.getDistance());
		if (returnFlg==-1) {
	  	return returnFlg;
		}else if(returnFlg==0){
	   	return  resID.compareTo(location.getResID());
		}
		return returnFlg;
	  }
	
	/**
	public Double getGeoDistance(int postcalcode,ViewDealerGeocode viewDealerGeocode ){
	      nearestDist = distanceUtil.distance2(new Double(custLoc.getLat()).doubleValue(), new Double(custLoc.getLng()).doubleValue(),new Double(viewDealerGeocode.getLatitude().toString()).doubleValue(), new Double(viewDealerGeocode.getLongitude().toString()).doubleValue(),'M');
	      return new Double(nearestDist);
	    }

**/

}
