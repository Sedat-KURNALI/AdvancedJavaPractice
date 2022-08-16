package TechProEd2021._01_JavaTechProEd.day17_forLoop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
       /*Kullanicidan pozitif bir rakam girmesini isteyin 
        * ve girilen rakama gore asagidaki sekli cizdirin
        
        	*
        	* *
        	* * *
        	* * * *
		*/
		/*bizim ��z�m
		for(int satir=1;satir<=4;satir++)
        {

            for(int sutun=1;sutun<=satir;sutun++)
                System.out.print("*");

            System.out.println();
            
            // hocan�n ��z�m
          */
		

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen faktoryel hesaplamak icin 35 den kucuk pozitif bir tamsayi girin");
        int sayi=scan.nextInt();
            for(int i=1; i<=sayi; i++)
            {
            	System.out.println(" ");
                for(int j=1; j<=i ;j++)
                
                	System.out.print("* ");

                	
                  
                  
        }
            
            scan.close();
          	}  
      
  
}  

		
		
		
		


