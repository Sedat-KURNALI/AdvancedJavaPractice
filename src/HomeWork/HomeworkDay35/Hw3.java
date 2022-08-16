package HomeWork.HomeworkDay35;
//create a class Country
//add at least 5 attributes
//add at least 5 constructors
//add method that return all attributes as one string
//in HW class(in different) create at least 10 object on that class
//call method to get attributes and print it


class Country{
	
	public String name;
	public String place;
	public int people;
	public boolean wellness;
	public String president;
	
	
	public Country(String n) {
		name=n;		
					
	}public Country(String n, String p){
		name=n;
		place=p;
		
	}public Country(String n, int a){
		name=n;
		people=a;
		
		
	}public Country(String n, int a,boolean t){
		name=n;
		people=a;
		wellness=true;
		
	}public Country(String n, int a,boolean f,String p){
		name=n;
		people=a;
		wellness=f;
		president=p;
		
	}public String CountryInfo() {
		
		return name+" "+ place+ " "+ "people: "+ people+ wellness+president;
	}
}

public class Hw3 {

	public static void main(String[] args) {
	
		Country a= new Country("Turkey");
		a.name="Turkey";
		
		Country b= new Country("Turkey","East");
		b.place="East";
		
		Country c= new Country("Turkey",80);
		
		c.people=80;
		c.wellness=false;
		
		Country d= new Country("Turkey",90,false);
		d.name="Turkey";
		d.people=90;
		
		Country e= new Country("USA");
		e.president="Trump";
		
		
		Country f= new Country("USA", 75, false);
		f.name="USA";
		f.president="Trump";
		f.wellness=false;
		
		Country g= new Country("USA");
		g.place="West";
		
		Country ulke= new Country("USA");
		ulke.people=65;
		
		Country t= new Country("USA","China");
		
		t.name="China";
		 
		Country y= new Country("USA",50);
		
		y.people=50;
		y.name="USA";
		y.place="East";
		y.wellness=true;
		y.president="Donald Trump"; 
		System.out.println(y.CountryInfo());
		

		
	}

}
