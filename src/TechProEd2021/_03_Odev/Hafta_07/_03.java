package TechProEd2021._03_Odev.Hafta_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03 {
    public static void main(String[] args) {

        /*
         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
       // System.out.println(list);
        int[] tekrarsizArray = new int[list.size()];
        int index = 0;
        for (int each : list) {
            tekrarsizArray[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(tekrarsizArray));
    }
}
