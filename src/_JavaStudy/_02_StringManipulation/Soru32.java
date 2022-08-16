package _JavaStudy._02_StringManipulation;

public class Soru32 {
    public static void main(String[] args) {
		/*
		Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz.
		String str="ilovejavatoo";
		Output: o v a
		 */

        String str = "ilovejavatoo";
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


	      /*  //2.yol
	        String str="ilovejavatoo";
            String str1[] = str.split("");
            List<String> list=new ArrayList<>();

            for (int i = 0; i < str1.length-1; i++) {
                for (int j = i+1; j < str1.length; j++) {
                    if (str1[i].equals(str1[j])) {
                        if (!list.contains(str1[i])) list.add(str1[i]);
                    }
                }
            }
            System.out.println(list);
*/
    }
}
