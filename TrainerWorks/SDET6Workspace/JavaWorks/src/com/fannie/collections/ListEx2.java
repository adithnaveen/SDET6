package com.fannie.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Sudhamani");
		list.add("Manasa");
		list.add("Emmanuel");
		
		System.out.println(list);
		System.out.println("Number of Elements " + list.size());
		list.add(2, "Sreeni");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.add("Subathra1");
		list.add("Subathra2");
		list.add("Subathra3");
		list.add("Subathra4");
		
		List<String> newList =  list.subList(4, list.size());
		System.out.println("List -> " + list);
		System.out.println("new List -> " + newList);
		
		
//		Iterator<String> itr = list.iterator();
		
//		while(itr.hasNext()){
//			System.out.println("Element values -> " + itr.next());
//		}
//		
//		for(String temp : list){
//			System.out.println(temp);
//		}
		
	}
}
