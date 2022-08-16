package TechProEd2021._01_JavaTechProEd.day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		
		String isim= "Ali";
		isim.concat("can");
		System.out.println(isim); // Ali
		
		System.out.println(isim.concat("can")); // Alican
		System.out.println(isim); // Ali
		
		// Stringlerde method ile yapt���m�z de�i�iklikler kal�c� olmaz 
		// cunku java string class �n� �mmutable yapm��t�r
		
		List<String> isimList = new ArrayList<>();
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);//[Ali, Can]
		isimList.remove(1);
		System.out.println(isimList); //[Ali]
		
		//list lerde method la yapt���m�z de�i�iklikler kal�c� olarak list e islenir.
		// cunku list mutable dir
		
	}

}
