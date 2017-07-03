package com.fannie.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment {
	public static void main(String[] args) throws IOException {
		Map<String, String[]>  map = new HashMap<String, String[]>();

		map.put("hi", new String[] {"HI", "HELLO", "HOLLA"});
		map.put("hi", new String[] {"HI1", "HELLO1", "HOLLA1"});
		map.put("hi", new String[] {"HI2", "HELLO2", "HOLLA2"});
		map.put("hi", new String[] {"HI3", "HELLO3", "HOLLA3"});
		map.put("hi", new String[] {"HI4", "HELLO4", "HOLLA4"});
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word ");
		String word = br.readLine();
		
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()){
			
			Map.Entry<String, String[]> temp = (Entry<String, String[]>) itr.next();
			
			if(word.equals(temp.getKey())){
				String [] strs  = temp.getValue();
				for(String t : strs){
					System.out.println(t);
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
