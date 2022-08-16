package HomeWork.HomeworkDay20;

import java.util.HashMap;

public class MapAB {

	public static void main(String[] args) {
//	    Modify and print the given map as follows:
//	    for this problem the map may or may not contain the "a" and "b" keys.
//	    If both keys are present, append their 2 string values together
//	    and store the result under the key "ab".
	//Verilen haritayı aşağıdaki gibi değiştirin ve yazdırın:
		// bu sorun için harita "a" ve "b" tuşlarını içerebilir veya içermeyebilir.
		// Her iki anahtar da varsa, bunların 2 dize değerini birbirine ekleyin ve sonucu "ab" anahtarı altında saklayın.
//	    {"a": "Hi", "b": "There"} → {"a": "Hi", "ab": "HiThere", "b": "There"}
//	    {"a": "Hi"} → {"a": "Hi"}
//	    {"b": "There"} → {"b": "There"}
		
		HashMap<String,String> map= new HashMap<>();
		
		map.put("a","Hi");
		map.put("b","There");
		System.out.println(map);
		 if(map.containsKey("a")&& map.containsKey("b")) {
			 System.out.println("ab: "+map.get("a")+map.get("b"));
			 
		 }else if(map.containsKey("b")|| map.containsKey("a") ){
			 
			 System.out.println(map);
		 }else
		 {
		System.out.println();	 
		 }

		
	}

}
