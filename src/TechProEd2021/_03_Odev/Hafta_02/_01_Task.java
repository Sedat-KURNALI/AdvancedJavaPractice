package TechProEd2021._03_Odev.Hafta_02;

public class _01_Task {
           /*
           Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
            String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            */

    public static void main(String[] args) {

        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int A = pickName.indexOf("A");
        int L = pickName.indexOf("L");
        int I = pickName.indexOf("I");
        char A1 = pickName.charAt(A);
        char L1 = pickName.charAt(L);
        char I1 = pickName.toLowerCase().charAt(I);
        System.out.println("" + A1+" "+ L1 +" "+ I1);

    }
}
