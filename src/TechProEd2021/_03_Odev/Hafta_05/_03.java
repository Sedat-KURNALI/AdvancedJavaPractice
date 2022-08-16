package TechProEd2021._03_Odev.Hafta_05;

public class _03 {
    public static void main(String[] args) {
        /*
Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz.
String str=“ilovejavatoo”
Output: o v a
         */
        String str = "ilovetojavatoo";
        String[] arr = str.split("");
        String strYeni="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && ((!strYeni.contains(str.charAt(i) + "")))) {
                    strYeni += str.charAt(i) + " ";
                }
            }
        } System.out.println(strYeni);
        System.out.println();
    }
}

