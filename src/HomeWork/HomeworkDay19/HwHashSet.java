package HomeWork.HomeworkDay19;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HwHashSet {

	public static void main(String[] args) {
//		//8. Write a Java program to convert a hash set to a tree set.
		HashSet<Integer> myset= new HashSet<>();
		    myset.add(2);
			myset.add(5);
			myset.add(6);
			Set<Integer> myset1= new TreeSet<>(myset);
			System.out.println(myset1);
		
//		
//		//9. Write a Java program to convert a hash set to a List/ArrayList.
			HashSet<String> s= new HashSet<>();
			
			s.add("number");
			s.add("integer");
			s.add("name");
			s.add("age");
			s.add("height");
			
			
			
			 ArrayList<String> s2 = new ArrayList<String>(s);
			 System.out.println(s2);
//			
//		//10. Write a Java program to compare two hash set.
			 if(myset.equals(s)) {
				 System.out.println("they are same");
			 }else
				 System.out.println("they are different");
		
		//11. Write a Java program to compare two sets and retain elements which are same on both sets.
			 HashSet<String> names= new HashSet<>();
				
				names.add("number");
				names.add("integer");
				names.add("name");
				names.add("age");
				names.add("height");
				
				HashSet<String> s1= new HashSet<>();
				
				s1.add("number");
				s1.add("integer");
				s1.add("isim");
				s1.add("age");
				s1.add("boy");
				
		          names.retainAll(s1);
		         
		          System.out.println(names);
			
		//12. Write a Java program to remove all of the elements from a hash set.
			 
			 s.removeAll(s);
			 System.out.println(s);

//		//13. Write a Java Program to find duplications
			 ArrayList<Integer> numbers = new ArrayList<>();
		        numbers.add(1);
		        numbers.add(5);
		        numbers.add(2);
		        numbers.add(3);
		        numbers.add(5);
		        numbers.add(10);
		        numbers.add(5);
		        numbers.add(5);
		          
//		        
		        HashSet<Integer> set = new HashSet<>(numbers);
//		        
		        System.out.println( numbers.size());
		        System.out.println(set);
	
		        if(numbers.size()> set.size()) {
		        	System.out.println("there is a duplication");
		        }
	}

}
