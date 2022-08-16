package HomeWork.HomeworkDay32;

public class CallingFood {

	public static void main(String[] args) {
		
		Food fd=new Food();
		
		fd.appleWeight=2;
		fd.orangeWeight=3;
		fd.applePrice=5;
		fd.orangePrice=8;
		
		int total1=fd.totalPrice(5, 8);
		int total2=fd.totalWeight(2, 3);
		
		System.out.println(total1);
		
		System.out.println(total2);

	}

}
