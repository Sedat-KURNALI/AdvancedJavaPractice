package TechProEd2021._01_JavaTechProEd.day16_forLoop;

public class C4_forLoop04 {

	public static void main(String[] args) {
		// 50 ile 50 den b�y�k 150 den k���k tam say�larda 
		//7 ile tam b�l�nebilenleri toplay�p sonucu yad�ran bir kod yaz�n�z.

		 // 50'den buyuk 150'den kucuk olan tamsayilardan
        // 7 ile tam bolunebilenleri toplayip
        // sonucu yazdiran bir kod yaziniz
        
        int toplam=0;
        
        for (int i = 51; i < 150; i++) {
            
            if (i%7==0) {
                //toplam=toplam+i;
                toplam+=i;
            }
        }
        System.out.println(toplam);
		
		
	}

}
