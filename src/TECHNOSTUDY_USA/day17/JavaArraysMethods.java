package TECHNOSTUDY_USA.day17;

import java.util.Arrays;

public class JavaArraysMethods {

    public static void main(String[] args) {
        //to print array
        System.out.println( "to print array" );
        String[] names = {"John", "Ali", "Marta"};
        System.out.println( Arrays.toString( names ) );


        //to sort array
        System.out.println( "\nto sort array" );
        int[] numbers1 = {4, 1, 9, 5, 3};
        System.out.println( "before sort: " + Arrays.toString( numbers1 ) );
        Arrays.sort( numbers1 );
        System.out.println( "after sort: " + Arrays.toString( numbers1 ) );

        // to check if two arrays are equal
        System.out.println( "\nto check if two arrays are equal" );
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {3, 2, 1};
        System.out.println( "if a == b: " + Arrays.equals( a, b ) );
        System.out.println( "if b == c: " + Arrays.equals( b, c ) );
        Arrays.sort( c );
        System.out.println( "after sort c, if b == c: " + Arrays.equals( b, c ) );

        boolean checkingArrays = Arrays.equals( a, b ) && Arrays.equals( b, c );
        System.out.println( "a==b && b == c: " + checkingArrays );

        // to populate/fill your array
        System.out.println( "\nto populate/fill your array" );
        int[] numbers2 = new int[10];
        System.out.println( "before filling array: " + Arrays.toString( numbers2 ) );
        Arrays.fill( numbers2, 8 );
        System.out.println( "after filling array: " + Arrays.toString( numbers2 ) );

        // to search value in SORTED array and return index
        System.out.println( "\nto search value in SORTED array and return index" );
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println( "search for 2: " + Arrays.binarySearch( numbers3, 3 ) );
        /* AKSAM DERSI
        package _duzenle.TECHNOSTUDY_USA.day17;

import java.util.Arrays;

public class JavaArraysMethods {
    public static void main(String[] args) {
//            Arrays.toString(array) - get String representation of array in one line
        String[] names = {"Bob", "Eren", "Armin"};
        System.out.println( ".toString: " + Arrays.toString( names ) );

//            Arrays.sort(array);  - to sort array in natural order
        Arrays.sort( names );
        System.out.println( "\n.sort: " + Arrays.toString( names ) );

//            Arrays.equals(array1, array2) - check if both of arrays have same order of values
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 1, 3};
        System.out.println( "\na == b: " + Arrays.equals( a, b ) );
        System.out.println( "a == c: " + Arrays.equals( a, c ) );


//            Arrays.fill(array, value  ); - fill the array with provided value
        int[] numbers = new int[5];
        System.out.println( "\nbefore .fill: " + Arrays.toString( numbers ) );
        Arrays.fill( numbers, 24 );
        System.out.println( "after .fill: " + Arrays.toString( numbers ) );

        // Arrays.binarySearch(array, value); -
        // return index of given value in SORTED array, otherwise returns -1
        int[] evenNumbers = {2, 4, 6, 8, 10, 12};
        System.out.println( "Index of 6 is: " + Arrays.binarySearch( evenNumbers, 6 ) );
        System.out.println( "Index of 14 is: " + Arrays.binarySearch( evenNumbers, 14 ) );

    }

}

         */

    }
}
