package TECHNOSTUDY_USA.example.ENUM2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("A", Departments.COMPUTER_ENGINEERING);
        Student student2 = new Student("B", Departments.MATH);
        Student student3 = new Student("C", Departments.PHYSICS);
        Student student4 = new Student("D", Departments.BIOLOGY);
        Student student5 = new Student("E", Departments.CHEMISTRY);
        Student student6 = new Student("F", Departments.MATH);
        Student student7 = new Student("G", Departments.MEDICAL);
        Student student8 = new Student("H", Departments.MATH);
        Student student9 = new Student("I", Departments.COMPUTER_ENGINEERING);

        ArrayList<Student> studentList = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5,
        student6, student7, student8, student9));

        for (Student student : studentList) { //iteration
            if (student.depts == Departments.MATH) {
                System.out.println(student.name);
            }
        }
    }
}
