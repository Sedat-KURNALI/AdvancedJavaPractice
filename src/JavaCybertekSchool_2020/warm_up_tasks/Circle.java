package JavaCybertekSchool_2020.warm_up_tasks;

public class Circle {

    int radius;
    static double pi =3.14;
    int diameter = radius*2;

    public Circle(int radius){
        this.radius=radius;
    }
    public double area() {
        return pi*radius;
    }
    public double perimeter (){
        return pi*diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", diameter=" + diameter +
                '}';
    }
}
