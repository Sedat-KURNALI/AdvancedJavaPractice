package TechProEd2021._01_JavaTechProEd.day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		
		int y = 1;
		int z = 1; 
		
		
		int a = y<10 ? y++ : z++;
		
		
		
		System.out.println(y + "," + z + "," + a);
		//y=2
		
		System.out.println(y++);
		
		
		System.out.println(++y);
		
		System.out.println(y);
		


	}

}
