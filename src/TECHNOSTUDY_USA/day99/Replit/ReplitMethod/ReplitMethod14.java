package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod14 {
    /*
    Write a method called append
That accepts two integer arrays as parameters
and returns a new array that (contains) the result of appending the second array's values at the end of the first array.

 For _duzenle.TECHNOSTUDY_USA.example, if arrays array1 and array2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively,

 the call of append(array1 , array2 ) should return a new array containing
 {2, 4, 6, 1, 2, 3, 4, 5}.
     */
    public static int[] append (int[] a, int[] b){
        int [] newArray = new int[a.length+b.length];
        int index = 0;
        for (int element : a) {
            newArray[index] = element;
            index++;
        }
        for (int element : b) {
            newArray[index] = element;
            index++;
        }
       return newArray;
    }
}

