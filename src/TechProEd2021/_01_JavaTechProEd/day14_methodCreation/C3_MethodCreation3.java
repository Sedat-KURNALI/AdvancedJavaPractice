package TechProEd2021._01_JavaTechProEd.day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		 // Verilen 3 double say�n�n ortalamas�n� alan bir method yaz�n 
		 // main method i�inden �a��rarak methodu �al��t�r�n
		
        ortalama (80,60,55); // 3 parametresi olan methodu arar 65 yazd�r�r
        ortalama (80,60);  // 2 parametresi olan methodu arar 70 yazd�r�r
        
    } // MM sonu
    
    public static void ortalama (double sayi1, double sayi2, double sayi3) {
        System.out.println("Girdiginiz �c Sayinin Ortalamsi :" + ((sayi1+sayi2+sayi3)/3));

       
	}
    
    public static void ortalama(double sayi1, double sayi2) {
        
        System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
    }
   

} // Class Sonu
