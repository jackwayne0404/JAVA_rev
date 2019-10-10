package com.Jack.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,5};
		int[] [] arr2 = {arr1};

			System.out.println(Arrays.toString(arr2[0]));
			System.out.println((int)(Math.random()*10));
		
		
	Map <String, String>map =  new TreeMap<String, String>();
	
	map.put("a", "get");
	map.put("b", "set");
	map.put("c", "set");
	map.put("d", "go");
	map.values();
	
	
	testMap(map);
	System.out.println(	map.values());
	
	for( Map.Entry<String, String> mapPrinter : map.entrySet()) {
		
		
		System.out.println(mapPrinter.getKey() + " " +mapPrinter.getValue() + "_");
	}
	

		
	}
	
	public static void testMap(Map<String, String> map) {
		
		map.put("h","anema");
		map.put("j", "The pot");
		map.put("z","lateralus");
		
	}
}
