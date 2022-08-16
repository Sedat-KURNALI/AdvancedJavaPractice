package HomeWork.HomeworkDay14;

public class ArrayHomework {

	public static void main(String[] args) {
		
		int myArray[]= {34,5,6,2,3,78,1};
		
		double sum=0;
		double average=0;
		for(int i=0;i<myArray.length;i++){
			
			
			sum= sum+myArray[i];
			average=sum/myArray.length;
			
		}
		
		System.out.println(sum);
		System.out.println(average);
		
	}
}
