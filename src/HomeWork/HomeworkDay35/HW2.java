package HomeWork.HomeworkDay35;
//create a class Person
//add at least 5 attributes
//add at least 5 constructors
//add method that return all attributes as one string
//in HW class(in different) create at least 10 object on that class
//call method to get attributes and print it




class Person{
	
	public String name;
	public int age;
	public String eyeColor;
	public boolean trusthy;
	public int height;
	
	public Person(String n) {
		
		name=n;
		
	}public Person(int a){
		
		age=a;
		
	}public Person (String e, int a){
		
		eyeColor=e;
		
		age=a;
		
	}public Person(boolean t){
		
		trusthy=t;
		
	}public Person(String na,int b, String color,boolean f){
		
		name=na;
		height=b;
		eyeColor=color;
		trusthy=f;
		
	}public String GetInfo() {
		return "Name: " + name+" "+
				"Age: " + age+" "+
				"Eye Color: "+ eyeColor+" "+
				"I can trust: "+ trusthy+" "+
				"Height: "+ height;
	}
}

public class HW2 {

	public static void main(String[] args) {
		Person a= new Person("Ahmet");
		a.name="Ahmet";
		a.age=30;
		a.eyeColor="brown";
		a.height=172;
		a.trusthy=true;
		
		Person b=new Person(25);
		b.age=25;
		
		Person c=new Person(false);
		c.name="Daniel";
		c.trusthy=false;
		
		Person d= new Person("Green");
		d.eyeColor="Green";
		d.name="Michael";
		d.age=8;
		
		Person e= new Person("Olivia");
		e.name="Olivia";
		e.eyeColor="Blue";
		
		Person kim= new Person(true);
		kim.name="Yavuz";
		kim.trusthy=true;
		
		Person t= new Person("Rana",4,"brwon",true);
		t.name="Rana";
		
		Person y= new Person("Akif",2,"green",true);
		
		y.eyeColor="green";
		y.name="Akif";
		
		Person w= new Person(58);
		w.age=48;
		w.name="Jack";
		
		Person person= new Person(false) ;
			person.trusthy=false;
			person.name="Will";
			
			System.out.println(a.GetInfo());
		}
	}


