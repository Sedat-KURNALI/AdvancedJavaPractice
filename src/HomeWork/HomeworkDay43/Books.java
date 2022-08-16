package HomeWork.HomeworkDay43;
// Let's write a Online-Shop that sells books: ChildrenBook & Comics
// use inheritance, polymorphism and encapsulation while doing this

// Note: this HW is open-ended, so there a lot of way to solve it
// task about salary is similar to this

// Hint: you can use Book as parent class and define price() method there

public class Books {
	
	private String bookname;
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	private int pageNumber;
	
	public int price() {
		
		return 40;
	}
	

}

class ChildrenBook extends Books{
	
	public int price() {
		return super.price()-10;
	}
	
	
}

class Comics extends Books{
	
	public int price() {
		return super.price()-20;
	}
}
