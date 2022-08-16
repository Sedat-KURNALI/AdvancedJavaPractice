package HomeWork.HomeworkDay21;

public class CallClass {

	public static void main(String[] args) {
		CallingClass c= new CallingClass();
		
		c.s="Rana";
		c.age=3;
		c.a='R';
		c.sentence="The quick brown fox jumps over the lazy dog";
		System.out.println(c.s+ c.age+c.a);
		
		String [] b=c.sentence.split(" ");
		
		System.out.println(b.length);

	}

}
