package HomeWork.HomeworkDay35;
//create a class Bank
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it

class Bank{
	public int serial;
	public String name;
	public String place;
	
	public Bank(String n) {
		name=n;
	}public Bank(int s, String a, String p){
		serial=s;
		name=a;
		place=p;
	}public Bank( ){
		place="Alpharetta";
	}public String getAttributes() {
		
		return "name: "+ name+"Serial: "+serial+"Place: "+ place;
	}
}

public class HW {
	
	

	public static void main(String[] args) {
	
		Bank b=new Bank();
		b.name="Chase";
		b.serial=12345;
		b.place="Alpharetta";
		
		Bank c=new Bank();
		
		c.serial=1234;
		System.out.println(c.serial);
		
		Bank bank=new Bank();
		bank.place="Roswell";
		System.out.println(bank.place);
		
		 Bank d= new Bank();
		 d.name="TD Bank";
		 
		 System.out.println(d.name);
		 
		 System.out.println("-----------");
		 
		 System.out.println(b.getAttributes());
	}

}
