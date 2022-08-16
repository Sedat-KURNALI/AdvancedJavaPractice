package HomeWork.HomeworkDay20;

import java.util.HashMap;

public class Pairs {

	public static void main(String[] args) {
//	    Given an array of non-empty strings,
//	    create and return a Map<String, String> as follows:
//	    for each string add its first character as a key with
//	    its last character as the value.

//	    ["code", "bug"] → {"b": "g", "c": "e"}
//	    ["man", "moon", "main"] → {"m": "n"}
//	    ["man", "moon", "good", "night"] → {"g": "d", "m": "n", "n": "t"}
		
		HashMap<String,String> map= new HashMap<>();
		String s="code";
		String s2="moon";
		map.put(s, s2);
		
		char c[]=s.toCharArray();
		char ch[]=s2.toCharArray();
		
		
			System.out.println(s.charAt(0) + " : "+ s.charAt(s.length()-1));
			System.out.println(s2.charAt(0) + " : "+ s2.charAt(s2.length()-1));
			
		}
	}


