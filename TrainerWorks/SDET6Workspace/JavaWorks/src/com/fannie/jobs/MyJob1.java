package com.fannie.jobs;

import java.util.ArrayList;
import java.util.List;

public class MyJob1 {
// this method shall take a parameter to insert 
	public boolean insertEmp(int val){
		if(val ==1){
			return true;
		}else {
			return false;
		}
	}
	
	public int getNumberOfEmps(){
		// assume it will come from DB 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return 5;
	}

	public List<String> getMyEmps(){
		// write a test case if size id 0 pass 
		// if size is  != 0 fail 
		return new ArrayList<>();
	}








}
