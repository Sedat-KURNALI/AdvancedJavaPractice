package TECHNOSTUDY_USA.day20;

public class Task1 {
    public static void main(String[] args) {
        String name1 ="John";
        String name2 ="Mark";
        String name3 ="Ayse";

        boolean twoSameLength = isSameLength(name1, name2);
        boolean threeSameLength = isSameLength(name1, name2, name3);

    }

    // create a method that checks if given two names have same length
    public static boolean isSameLength (String a, String b){
        return a.length() == b.length();
    }
    // create a method that checks if given three names have same length
    public static boolean isSameLength (String a, String b, String c ){
        return isSameLength(a, b) && isSameLength(b, c);

    }


}
