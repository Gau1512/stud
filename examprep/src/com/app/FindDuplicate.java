package com.app;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
	
public static void countDuplicateCharacter(String str) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[]charArray=str.toCharArray();
		
		//checking each character
		// of charArray
		for(char c:charArray) {
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);  
					
				}
			else
				map.put(c, 1); 
			
			}
		
		
		//traverse the hashmap,check  if the count of the charcater is greater than 1 and print frequency
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
		
			
		}
	
	public static void main(String[] args) {
		String str="Hello hi everyone";
		
		countDuplicateCharacter(str);
		
	}
		

}
