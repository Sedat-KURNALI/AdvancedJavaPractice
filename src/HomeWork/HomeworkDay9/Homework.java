package HomeWork.HomeworkDay9;

public class Homework {

	public static void main(String[] args) {
		// 1. Write program that gets two inputs from user then prints sum
		
		
		int a=3;
		int b=5;
		int sum=a+b;
		System.out.println("Sum :" + sum);
	    // 2. Write simple calculator,
	    //     a. reads first input
	    //     b. reads operator (+, -, *, /)
	    //     c. reads second input
	    //     d. prints result
	    // 3. Write program that calculates from string:
		String s="9";
		String s1="1";
		
		int num=Integer.valueOf(s);
		int num1=Integer.valueOf(s1);
		int total=num+num1;
		int sub=num - num1;
		System.out.println(total);
		System.out.println(sub);
		
		
		
	    //    ex: one plus nine => 10, four subtract 2 => 2
	//
//	    public class Test {
//	        public static void main(String[] args)
//	        {
//	            for (;;)
//	                System.out.println("TECHNO");
//	        }
//	    }
	////Options:
	////1.TECHNO
	////2.Compile time error
	////3.Run time Exception
	////4.TECHNO (Infinitely)
		
//		Answer:1
	//
//	    class Test {
//	        public
//	        static void main(String[] args)
//	        {
//	            for (int i = 0; i < 3)
//	            System.out.println("TECHNO");
//	        }
//	    }
	////Options:
	////1.TECHNO TECHNO TECHNO
	////2.Compile time error
	////3.TECHNO (Infinitely)
	////4.No output
		
//		Answer:1
	//
//	    class Test {
//	        public static void main(String[] args)
//	        {
//	            boolean b1 = true;
//	            if (b1 = false) {
//	                System.out.println("HELLO");
//	            } else {
//	                System.out.println("BYE");
//	            }
//	        }
//	    }
	////Option:
	////1.HELLO
	////2.BYE
	////3.Compile time error: re- initialization
	////4.No output
		
//		Answer;3
	//
//	    public class Test {
//	        public
//	        static void main(String[] args)
//	        {
//	            int a = 10, b = 20;
//	            if (a < b) {
//	                if (a > b) {
//	                    System.out.println("HELLO TECHNO");
//	                } else {
//	                    System.out.println("WELCOME");
//	                }
//	            }
//	        }
//	    }
	////Option:
	////1.HELLO TECHNO
	////2.WELCOME
	////3.Compile time error
	////4.HELLO TECHNO WELCOME
	//
		
//		Answer;3
		
//	    class Test {
//	        public static void main(String[] args)
//	        {
//	            for (int i = 0;; i++) {
//	                System.out.println("HIII");
//	            }
//	            System.out.println("BYE");
//	        }
//	    }
	////Options:
	////1. HIII
	////2. HIII(infinitely)
	////3. BYE
	////4. Compile time error
//
//		Answer;4
	}

}
