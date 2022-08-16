package HomeWork.HomeworkDay43;

public class Hw {

	public static void main(String[] args) {
		
		Books b=new Comics();
		
		((Comics)b).setBookname("Tomix");
		
		((Comics)b).price();
		
		((Comics)b).setPageNumber(100);
		
		
		
		Books b1=new ChildrenBook();
		
		b1.setBookname("Harry Potter");
	

		b1.setPageNumber(600);
		
		b1.price();
	}

}
