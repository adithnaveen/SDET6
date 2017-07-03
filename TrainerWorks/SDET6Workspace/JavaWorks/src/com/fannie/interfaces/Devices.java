package com.fannie.interfaces;
// if a class has private variables and public getters and setters then 
//it is called java bean 
public class Devices  implements Comparable<Devices>{
	private int deviceId;
	private String deviceName;
	
	
	public Devices(int deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}


	public int getDeviceId() {
		return deviceId;
	}


	public String getDeviceName() {
		return deviceName;
	}
// here we have to specify on which filed it needs to be sorted 
	@Override
	public int compareTo(Devices o) {
		// ascending order 
		// return this.deviceId - o.deviceId;
		// descending order 
		// return o.deviceId - this.deviceId;
		
		// ascending order on deviceName 
		return this.deviceName.compareTo(o.deviceName);
	}

}









