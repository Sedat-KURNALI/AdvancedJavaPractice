package TechProEd2021._01_JavaTechProEd.day21_scope;

public class Scope1 {
	
	
	static int okulId= 1201;
	static String okulAdi= "Y�ld�z Koleji";
	static boolean acikMi;
	
	
	
	public static void main(String[] args) {
		System.out.println(okulId + " " + okulAdi + " " + acikMi);  //1201 Y�ld�z Koleji false 1.�al��an kod
		okulId=1202;
		acikMi=true;
		
		staticMethod();
		
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //1203 Y�ld�z Koleji true 3.�al��an kod
		
	}
	
	public static void staticMethod() {
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //1202 Y�ld�z Koleji true 2.�al��an
		okulId=1203;
		
		
	}
	public void method() {   //  bu class �al��t���nda bu method �ALI�MAZ...
		
		okulId=1205;
		
		
	}

}
