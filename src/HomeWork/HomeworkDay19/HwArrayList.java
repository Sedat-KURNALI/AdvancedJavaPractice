package HomeWork.HomeworkDay19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HwArrayList {

	public static void main(String[] args) {
		//12. Write a Java program to extract a portion of a array list.
		 ArrayList<String> Strings = new ArrayList<String>();
		  Strings.add("Red");
		  Strings.add("Green");
		  Strings.add("Orange");
		  Strings.add("White");
		  Strings.add("Black");
		  System.out.println("Original list: " + Strings);
		  
		  List<String> sub_List = Strings.subList(0, 3);
		  
		  System.out.println("List of first three elements: " + sub_List);
		  
		//13. Write a Java program to compare two array lists.
		ArrayList <Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(20);
		arrayList1.add(30);
		arrayList1.add(40);
		arrayList1.add(50);
		ArrayList <Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(20);
		arrayList2.add(30);
		arrayList2.add(40);
		arrayList2.add(50);
		
		if(arrayList1.equals(arrayList2)) {
			System.out.println("They are same arraylist");
		}
		
		
		//14. Write a Java program of swap two elements in an array list.
		ArrayList<String> colors = new ArrayList<String>();
		  colors.add("Red");
		  colors.add("Green");
		  colors.add("Orange");
		  colors.add("White");
		  colors.add("Black");
		  
		  Collections.swap(colors, 2, 3);
		  System.out.println(colors);
		  
		//15. Write a Java program to join two array lists.
		  ArrayList<String> color = new ArrayList<String>();
		  color.add("Red");
		  color.add("Green");
		  color.add("Orange");
		  color.add("White");
		  color.add("Black");
		  ArrayList <String> array = new ArrayList<>();
			array.add("banana");
			array.add("Pear");
			array.add("apple");
			array.add("car");
			
			ArrayList<String> a=new ArrayList<>();
			
			a.addAll(array);
			a.addAll(color);
			System.out.println(a);
			
			
		//
		//16. Write a Java program to clone an array list to another array list.
		
		 ArrayList<String> colors2 = new ArrayList<String>();
		  colors2.add("Red");
		  colors2.add("Green");
		  colors2.add("Orange");
		  colors2.add("White");
		  colors2.add("Black");
		  ArrayList <Integer> arrayList3 = new ArrayList<>();
			arrayList3= (ArrayList)colors2.clone();
			
			System.out.println(arrayList3);
		//17. Write a Java program to empty an array list.
			
			System.out.println(a.removeAll(a));
		
		//18. Write a Java program to test an array list is empty or not.
			
		System.out.println(colors2.isEmpty());
		
		//19. Write a Java program to trim the capacity of an array list the current list size.
		array.trimToSize();
		System.out.println(array);
		
		//20. Write a Java program to increase the size of an array list.
		
		array.ensureCapacity(6);
		System.out.println(array);
		
		//21. Write a Java program to replace the second element of a ArrayList with the specified element.
		
		array.set(2,"red");
		System.out.println(array);
		
	
		//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
		    
		for(int i=0;i<array.size();i++)
			  System.out.println(array.get(i));
	}

}
