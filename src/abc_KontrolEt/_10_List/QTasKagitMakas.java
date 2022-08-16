package abc_KontrolEt._10_List;

import java.util.Scanner;

public class QTasKagitMakas {

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        // kagit >tas

        int kullaniciKazandi = 0 , bilgisayarKazandi=0;
        Scanner Scan=new Scanner(System.in);
    
       
        System.out.println("0-taş ,1-kağıt ,2-makas");
   
       // for(int i=0 ;i<3;i++){
        
          int num = (int)(Math.random() * 3);
          
        System.out.println("Sıra sende: ");
        
          int  tahmin=Scan.nextInt();
    if(tahmin==0 && num == 2 || tahmin==1 && num==0 || tahmin==2 && num==1){
      kullaniciKazandi++;
    }
    if(num==0 && tahmin == 2 || num==1 && tahmin==0 || num==2 && tahmin==1){
      bilgisayarKazandi++;
    }
    //}
    
      if(kullaniciKazandi > bilgisayarKazandi){System.out.println("bilgisayar: "+bilgisayarKazandi+" oyuncu: "+kullaniciKazandi+" Tebrikler Kazandınız!");}
      if(kullaniciKazandi < bilgisayarKazandi){System.out.println("bilgisayar: "+bilgisayarKazandi+" oyuncu: "+kullaniciKazandi+" Kaybettiniz!");}
      if(kullaniciKazandi == bilgisayarKazandi){System.out.println("bilgisayar: "+bilgisayarKazandi+" oyuncu: "+kullaniciKazandi+" Berabere!");}
    	
    	
    	
    	
    	
    	
    	
    	
    	

    }

}
