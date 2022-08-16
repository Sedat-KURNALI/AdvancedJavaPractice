package TechProEd2021._01_JavaTechProEd.day28_foreachLoop;

public class C1_ForeachLoop01 {

	public static void main(String[] args) {
		
		
// bir array'in tum elemanlarini for loop ile yazdiralim
        
        int arr[]= {2,4,6,8,10,12};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        
        // for loop yazmamizin amaci array'in TUM ELEMANLARI uzerinde islem yapmak ise
        // foreach loop daha kolay kod yazmamizi saglar
        
        
        // each ==> her bir demek 
        // for each loop istedigim bir topluluktaki tum elemanlari birer birer bana getirir
        // for each loop'da baslangic degeri YOKTUR, bitis degeri YOKTUR, index YOKTUR
        System.out.println(); // consol da  bir a�ag� ge�er
        
        for (int each : arr) { 
            
            System.out.print(each + " ");
        }
		
	}

}
