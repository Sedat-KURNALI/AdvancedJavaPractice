package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

public class C3_StartsWithIsEmpty {
	public static void main(String[] args) {

		String str = "Her g�n Java olsa";
		System.out.println(str.startsWith("H")); // true
		System.out.println(str.startsWith("Her "));// true
		System.out.println(str.startsWith("g", 4));// true
		System.out.println(str.startsWith("java", 7));// false

		System.out.println(str.isEmpty());// false

		String str2 = "";
		System.out.println(str2.isEmpty());// true
		// System.out.println(str2.isBlank()); // true

		//String str3 = null;
		// System.out.println(str3.isEmpty());// RTE (RUN TiME ERROR)
											// NULL BiR DEGER DEGiLDiR.
											// sadece str 3 in birsey e�it olmad�g�n� gosteren pointer

	}
}
