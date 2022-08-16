package MENTORING._09_Polymorphism.testA;

public class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}

class Test {
    public static void main(String[] args) {
        B a = new B();
        System.out.println(a.x);
    }
}