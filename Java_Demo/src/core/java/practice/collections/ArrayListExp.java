package core.java.practice.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExp {

	public static void main(String[] args) {

		// create ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// Add elements to ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("Swift");
		System.out.println("ArrayList: " + languages);

		// get elements from ArrayList
		String lang = languages.get(0);
		System.out.println("Get language from a ArrayList in Java: " + lang);

		// change value of elements in ArrayList
		languages.set(1, "Go");
		System.out.println(languages);
		
		//remove elements from the ArrayList
		languages.remove(2);
		System.out.println(languages);
		//get the size of ArrayList
		
		System.out.println(languages.size());
		
		//check if the ArrayList contains the specific element
		
		System.out.println(languages.contains("Python"));
		
		//sort the elements of an ArrayList
		
		languages.sort(Comparator.naturalOrder());
		System.out.println(languages);
		
		//check if the ArrayList is empty or not.
		
		System.out.println(languages.isEmpty());
		
		//Get index of a specific element in ArrayList
		System.out.println(languages.indexOf("Go"));
	}
}
