package TECHNOSTUDY_USA.day28.tasks.task2;

public class Rectangle {
    int length;
    int width;

    //instnace method getPerimeter
    int getPerimeter() {
        return (length + width) * 2;
    }


    // create method to calculate area of rectangle
    int getArea() {

        return length * width;
    }


    // create method to print attributes
    void printAttributes() {
        System.out.println("Length: " + length +
                "\nWidth: " + width);
    }

    //to get string representation of instance
    // you need to create method below
    public String toString() {
        return "{length=" + length + ", width=" + width + ", Perimeter :"+ getPerimeter()+ ", Area :"+getArea()+"}";
    }

}