package com.fannie.collections;

import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<Park> parks = new TreeSet<Park>();
		
		
		parks.add(new Park(101, "Outside park", "Herndon"));
		parks.add(new Park(773, "Frying Pan", "Herndon"));
		parks.add(new Park(333, "Old Ox", "Herndon"));
			
		for(Park temp : parks){
			System.out.println(temp +", " + temp.hashCode());
		}
	}
}
