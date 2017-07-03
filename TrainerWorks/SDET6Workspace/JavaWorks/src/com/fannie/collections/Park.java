package com.fannie.collections;

// bean 
// public getters and setters 
// private variables 
public class Park implements 
Comparable<Park>{
	private int parkId;
	private String parkName;
	private String parkloc;
	
	
	
	@Override
	public boolean equals(Object obj) {

		Park park = (Park) obj;
		if(
					this.parkId == park.parkId && 
					this.parkName.equals(park.parkName) && 
					this.parkloc.equals(park.parkloc)
		){
			return true;
		}else{
			return false;
		}

	}
	@Override
	public int hashCode() {
		return this.parkName.charAt(0);
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Park [parkId=" + parkId + ", parkName=" + parkName + ", parkloc=" + parkloc + "]";
	}
	public Park(int parkId, String parkName, String parkloc) {
		this.parkId = parkId;
		this.parkName = parkName;
		this.parkloc = parkloc;
	}
	public int getParkId() {
		return parkId;
	}
	public void setParkId(int parkId) {
		this.parkId = parkId;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getParkloc() {
		return parkloc;
	}
	public void setParkloc(String parkloc) {
		this.parkloc = parkloc;
	}
	@Override
	public int compareTo(Park o) {
		return this.parkId - o.getParkId();
	}
	
	
}
