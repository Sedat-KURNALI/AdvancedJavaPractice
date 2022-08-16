package TECHNOSTUDY_USA.day22;

import java.util.ArrayList;

public class Task1 {
    // create a method that will generate arrayList of double with random double values
    public static void main(String[] args) {
        generateList();
        ArrayList<Double> doubles = generateList();
                System.out.println(doubles);
        Double firstElement = retrieveElement(doubles , 0);
        System.out.println(firstElement);
        updateElement(doubles, 0, 33.0);
        System.out.println(doubles);
        removeThirdElement(doubles);
        System.out.println(doubles);
    }

    public static ArrayList<Double> generateList (){
        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            list.add(Math.random () * 100);
        }

        // another way;
        // list.add(Math.random() * 100);
        // list.add(Math.random() * 100);
        // list.add(Math.random() * 100);
        // list.add(Math.random() * 100);

        return list;
    }

    // create a method to retrieve an element at specified index from given arrayList
    public static Double retrieveElement(ArrayList<Double> list, int i){

        return list.get(i);

    }

    // create a method to update element in specified position
    public static Double updateElement (ArrayList<Double> list, int index, Double newElement){
        return list.set(index, newElement);
    }
    // create a method to update element in specified position
    public static Double removeThirdElement (ArrayList<Double> list){
        return list.remove (2);
    }

}
