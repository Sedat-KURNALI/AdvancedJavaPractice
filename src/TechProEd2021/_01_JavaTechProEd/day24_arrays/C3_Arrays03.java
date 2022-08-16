package TechProEd2021._01_JavaTechProEd.day24_arrays;

public class C3_Arrays03 {

	public static void main(String[] args) {
		
		// Soru 2: Verilen bir array�in tum elemanlarini toplayan bir program yazalim.
        int arr[]= {10,15,2,45,78};
        
        int toplam=0;
        
        for (int i = 0; i < arr.length; i++) {
            
            toplam+=arr[i];
        }
        System.out.println(toplam);
        
        
        // verilen array'in tum elemanlarini toString methodu olmadan yanyana ve ralarinda bir boslukla yazdirin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	
	}

}
