package com.fannie.collections;

import java.util.ArrayList;

public class ListEx1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(101);
		list.add("hello");
		list.add(true);
		list.add(new Object());
		
		for(Object temp : list){
			System.out.println(temp);
		}
		
	}
}
