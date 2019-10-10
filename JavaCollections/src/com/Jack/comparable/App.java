package com.Jack.comparable;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Details implements Comparable <Details>{
	
	String name ;

	public Details(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "details [name=" + name + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Details other = (Details) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Details other) {
		
		
		return -1 *name.compareTo(other.name);
	}
	
	
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List <Details> listOne= new ArrayList<Details>();
	
	SortedSet<Details> listTwo = new TreeSet<Details>();
	
	
	//addElements(listOne);
	addElements(listTwo);

	//showElements(listOne);
	
	showElements(listTwo);
	
	} 

	private static void addElements(Collection<Details> collection) {
		 collection.add( new Details("jack" ));
		 collection.add( new Details( "sparrow"));
		 collection.add( new Details( "craig"));
		 collection.add( new Details( "chris"));
		 collection.add( new Details( "hooer"));
		 collection.add( new Details( "mandm"));
		
	}
	
	
	private static void showElements(Collection<Details> collection) {
		
		for( Details d : collection) {
			System.out.println(d);
		}
	}

}
