package HomeWork.HomeworkDay44;

//public class HW2 {
	//write a Sum class 
	//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
	//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
	//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
	//in your main method call the class and run these 3 methods.
//public static void main(String[]args) {
//	
//	SumClass sum=new SumClass();
//	
//	System.out.println(sum.add(5, 6));
//	System.out.println(sum.add(5, 6, 7));
//	System.out.println(sum.add(1.2, 7.8));
//	
//}	
//	
//}
//	
//	class SumClass{
//		public int add(int x, int y) {
//			return x+y;
//		}
//		public int add(int x, int y,int z) {
//			return x+y+z;
//		}
//		public double add(double x, double y) {
//			return x+y;
//		}
//	}

	//2. Can we overload methods on return type?
	//will this work???? why? why not?
	
	//ANSWER: No, we need to add parameters inside the method parenthesis otherwise it might be ambiguity.
	
	//public class Main
	//{
//    public int foo() { return 10; }
//
//	    public char foo() { return 'a'; }
//
//	    public static void main(String args[])
//	    {
//	    }
//	}

	//3. Can we overload static methods?
	//ANSWER: Yes we can overload
	
	//4. Can we overload methods that differ only by static keyword?
	//will this work???? why? why not?
	
	// Answer: Nope, static methods can not be overridden that's why this is not going to work.
	
	//public class Test
	//{
//	    public static void foo()
//	    {
//	        System.out.println("Test.foo() called ");
//	    }
//	    public void foo()
//	    { // Compiler Error: cannot redefine foo() 
//	        System.out.println("Test.foo(int) called ");
//	    }
//	    public static void main(String args[])
//	    {
//	        Test.foo();
//	    }
	//}

	//5. Can we overload main() in Java?
	
	//Answer:Yes we can overload but when we run it, java will take the main method that one the first one
	
	//6. What is the difference between Overloading and Overriding?
	
//	Answer: Overloading has same method name but different parameters. Overriding has the same method name and same parameters.
//	Overloading is a compile time action, overriding is a run time action.
//	final,sttatic and private methods can be overloaded but cannot be overridden
//	You can overload a method in the same class but overriding occurs in the inherited classes
	
	//7. Can we Override static methods in java?
	
	//Answer: Nope, we cannot override static methods
	//it is related to question 7. 
	//what is the output of this program? why? why not?
	
	//ANSWER:   Static or class method from Base         (because it is a static method you cannot override, and since reference is from the base class
	//		      that's why output comes from the base class's static method)
	
//		Non-static or Instance method from Derived(it is overridden method because it is not a static)
	
//	
//	class Base
//	{
//	    public static void display()
//	    {
//	        System.out.println("Static or class method from Base");
//	    }
//	    public void print()
//	    {
//	        System.out.println("Non-static or Instance method from Base");
//	    }
//	}
//
//	class Derived extends Base
//	{
//	public static void display()
//	{
//	    System.out.println("Static or class method from Derived");
//	}
//	public void print()
//	{
//	    System.out.println("Non-static or Instance method from Derived");
//	} 
//	} 
//	  
//	//public class Test
//	//{

//	    public static void main(String args[ ])
//	    {
//	        Base obj1 = new Derived();
//	        obj1.display();
////
//	        obj1.print();
//	    }
//	}


