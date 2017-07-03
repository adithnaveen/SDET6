package com.fannie.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// to show working of Hash Map 
public class MapEx1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Benjamas", 2000);
		map.put("Gayatri", 2200);
		map.put("Sunil", 3322);
		map.put("Kanchan", 5555);
	/*	System.out.println(map);
		
		System.out.println("Benjamas Balance -> " + map.get("Benjamas"));
		
		map.put("Benjamas", 4000);

		System.out.println("Benjamas Balance -> " + map.get("Benjamas"));
		System.out.println(map.get("Sunil"));*/
		
		
		Set mySet = map.entrySet();
		
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next();
			
			System.out.println(temp.getKey() +", " + temp.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
