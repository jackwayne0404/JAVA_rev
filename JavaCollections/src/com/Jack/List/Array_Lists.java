package com.Jack.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_Lists {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		
		
		
		//doTimings("ArrayList",myList);
		//doTimings("Linked List", list);
	
		list.add(0, 9);

		System.out.println(list.size());
	
	}
	
	private static void doTimings(String type, List <Integer>list ) {
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<1E5; i++) {
			list.add(list.size()-100,i);
			
		}
		

		
		long end = System.currentTimeMillis();
		
		System.out.println(" Time taken " + (end - start) + "ms for " + type);
		
		
		
	}
	
	

	
	
}
