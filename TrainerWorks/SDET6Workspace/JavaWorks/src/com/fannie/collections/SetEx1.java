package com.fannie.collections;

import java.util.HashSet;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Vijaya");
		set.add("Sasankay");
		System.out.println(set.add("Kavitha"));
		
		boolean flag = set.add("Kavitha");
		System.out.println(flag);
		
		
		
		set.add("Kavitha");
		set.add("Kavitha");
		
		System.out.println(set);
		set.remove("Kavitha");

		HashSet<String> newSet = new HashSet<String>();
		newSet.addAll(set);
		
		
		
		
		System.out.println(set);
		
	}
}
