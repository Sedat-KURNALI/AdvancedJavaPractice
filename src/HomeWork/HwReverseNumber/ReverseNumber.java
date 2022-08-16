package HomeWork.HwReverseNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=153423649;
		
		int reverse = 0;
        int remainder = 0;
        
      
    	 try {  
       while(number>0) {
    	   
            remainder = number%10;
            
            reverse = reverse*10 + remainder;
            
              number = number/10;
              
//          
       }
       } catch( NumberFormatException e) {
       }   System.out.println("the reverse is greater than int max");
      
       System.out.println(reverse);
	}
	}

		
   


	

