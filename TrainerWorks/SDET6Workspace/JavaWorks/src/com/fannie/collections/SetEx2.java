package com.fannie.collections;

import java.util.HashSet;

// program is to store object (user)
public class SetEx2 {
	public static void main(String[] args) {
		HashSet<Park> parks = new HashSet<Park>();
		
		parks.add(new Park(101, "outside park", "Herndon"));
		parks.add(new Park(773, "Frying Pan", "Herndon"));
		parks.add(new Park(333, "Old Ox", "Herndon"));
		parks.add(new Park(333, "Old Ox", "Herndon"));
		parks.add(new Park(333, "Old Ox", "Herndon"));
		parks.add(new Park(333, "Old Ox", "Herndon"));
		parks.add(new Park(333, "Old Ox", "Herndon"));
			
		for(Park temp : parks){
			System.out.println(temp +", " + temp.hashCode());
		}
	}
}
