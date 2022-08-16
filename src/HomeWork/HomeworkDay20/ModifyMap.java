package HomeWork.HomeworkDay20;
import java.util.HashMap;

public class ModifyMap {

	public static void main(String[] args) {
		 // Modify and print the given map as follows:
	    // if the key "a" has a value, set the key "b" to have that value,
	    // and set the key "a" to have the value ""
	//	Verilen haritayı şu şekilde değiştirin ve yazdırın: "a" anahtarının bir değeri varsa, "b" anahtarını
		//	bu değere ve "a" anahtarını "" değerine sahip olacak şekilde ayarlayın
	    //{"a": "candy", "b": "dirt"} => "a": "", "b": "candy"
	    //{"a": "candy"} => "a": "", "b": "candy"
	    //{"a": "candy", "b": "carrot", "c": "meh"} => {"a": "", "b": "candy", "c": "meh"}
		
	HashMap<String,String> map= new HashMap<>();
		
		map.put("a","candy");
		map.put("b","dirt");
		map.put("c","meh");
		map.put("d"," ");
			
		
		if(!map.get("a").equalsIgnoreCase(" ") &&! map.get("b").equalsIgnoreCase(" " )) {
			System.out.println("b: "+ map.get("a"));
			System.out.println("a: "+ map.get("d"));
		}

	}

}
