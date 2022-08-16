package HomeWork.HomeworkDay16;

public class MultiDimensionalArraysTask1 {
	public static void main(String[] args) {
		
		String[] name= {"James", "Will", "Meghan"};
		String [] lastname= {"Bond","Smith","Markle"};
		
		String[][]NL= {{"James", "Will", "Meghan"},{"Bond","Smith","Markle"}};
		 
	            	
		            
//	System.out.println ("the length is" + NL.length);
//		System.out.println(NL[0][0]+NL[1][0]); 
		
		for (int i = 0; i <NL.length-1; i++){
			
		for(int j=0;j<NL[i].length;j++) {
		
				
//			System.out.println(NL[0][i]+NL[1][i]);
		

		System.out.print("\nNL:  " + NL[i][j] + " " + NL[i+1][j]);
		
		}		
		
		
		
	}
	}
}
	



