package com.Jack.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonOne{
	
	private int id;
	private String name;
	public PersonOne(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

class StringLengthComparator implements Comparator <String>{

	
	
	
	@Override
	public int compare(String o1, String o2) {
		
		int lenOne = o1.length();
		int lenTwo = o2.length();
		
		if( lenOne > lenTwo) {
			return 1;
		}
		if( lenOne < lenTwo) {
			return -1;
			
		}
		else
			return 0;
		}
}
	
	
	class StringLengthAlphabeticalComparator implements Comparator <String>{

		
		
		
		@Override
		public int compare(String o1, String o2) {
			return -o1.compareTo(o2);
			
			
		}
	
	
	
	
	
} 
public class UsingComparator {

	public static void main(String[] args) {
		// sorting strings 
		
		List<String> animals = new ArrayList<String>();
		List<Integer> numbers = new ArrayList<Integer>();
		animals.add("cat");
		animals.add("catu");
		animals.add("hotDoggie");
		animals.add("panda");
		animals.add("chimp");
		animals.add("jewpacabra");
		animals.add("spinx");
		animals.add("hammerhead shark");
		animals.add("elephant");
		
		
		
		Collections.sort(animals,new StringLengthAlphabeticalComparator());
		
		
		for(String iter: animals) {
			System.out.println(iter);
		}
		
		
		// sorting numbers 
		
		numbers.add(87);
		numbers.add(85);
		numbers.add(55);
		numbers.add(56);
		numbers.add(33);
		numbers.add(22);
		numbers.add(9);
		
		Collections.sort(numbers);
		
		
		for( int iterateElements : numbers) {
			System.out.println(iterateElements);
		}
		
		
		
		//Sorting arbitrary stuff
		
		
		List<PersonOne> people = new ArrayList<PersonOne>();
		
		
		people.add(new PersonOne(54,"joeyzab"));
		people.add(new PersonOne(85,"joeyzabc"));
		people.add(new PersonOne(35,"joeyzabcd"));
		people.add(new PersonOne(65,"joeyzabcde"));
		people.add(new PersonOne(3,"joeyzabcdefg"));
		people.add(new PersonOne(7,"joe"));
		people.add(new PersonOne(8,"joey"));
		people.add(new PersonOne(6,"joeyz"));
		people.add(new PersonOne(55,"joeyza"));
		
	Collections.sort(people, new Comparator<PersonOne>(){
		@Override
		public int compare(PersonOne o1, PersonOne o2) {
			
			if(o1.getId() > o2.getId())return 1;
			else if(o1.getId() < o2.getId()) return -1;
			else
				return 0;
		}
		
	});
	
	
	Collections.sort(people, new Comparator<PersonOne>() {

		@Override
		public int compare(PersonOne o1, PersonOne o2) {
			return - o1.getName().compareTo(o2.getName());
		}
		
		
		
	});
			
			
		
		
		
		
		
		for(PersonOne  p : people) {
			
			System.out.println(p);
		}
		
	}
	
	


	
	

	
}
