package HomeWork.HomeworkDay20;

import java.util.HashMap;

public class CountingLettersHw {

	public static void main(String[] args) {
		
        
        HashMap<Character, Integer> map  = new HashMap<>();
        
           
        String s=" BECOME A SOFTWARE TESTER IN 6 MONTHS";
  
        char[] ch = s.toCharArray(); 
  
       
        for (char c : ch) { 
        	
            if (map.containsKey(c)) { 
  
             
               map.put(c, map.get(c) + 1); 
             
            } else { 
  
              
                map.put(c, 1); 
            } 
        } 
  
       System.out.println(map);
      

        } 
    } 
  
   
    



	
