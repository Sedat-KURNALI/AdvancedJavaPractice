package TECHNOSTUDY_USA.day21;

import java.util.ArrayList; // ArrayList<List

public class JavaArrayList {

    // ArrayList
    // Set
    // Map

    public static void main(String[] args) {
        // Declaring ArrayList
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringsArrayList;
        ArrayList<Boolean> booleanArrayList;

        // initialize String ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");
        System.out.println(names);

        // adding element at specific position
        names.add(1, "Ali");
        System.out.println(names);

        // to get {retrieve) element from arrayList
        String elementAtIndex2 = names.get(2);
        System.out.println(elementAtIndex2);

        // to update/change/set element at specific position
        names.set(0, "Bulut");
        System.out.println(names);

        // to get size/length of arrayList
        int sizeOfArrayList = names.size();
        System.out.println(sizeOfArrayList);

        // check if arrayList is empty
        boolean empty = names.isEmpty();
        System.out.println(empty);

        // to remove element
        names.remove ("Aria");
        System.out.println(names);

        // to remove element at specific position
        names.remove (0);
        System.out.println(names);

        int indexOfAli = names.indexOf("Ali");
        System.out.println(indexOfAli);

        //print without any extra method
        System.out.println(names);

        // to remove everything from arrayList
        names.clear();
        System.out.println(names);
    }
}
