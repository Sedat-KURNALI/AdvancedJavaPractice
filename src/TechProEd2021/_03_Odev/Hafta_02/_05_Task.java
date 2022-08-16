package TechProEd2021._03_Odev.Hafta_02;

public class _05_Task {
    /*
     Iki degisken atayin :
                num1=1,
                num2=1
                ‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
                Note: ++ increment isareti 1 arttirir.
             Asagidaki sekilde Carpim Tablosunu yazdirin:
        1 X 1 = 1
        1 X 2 = 2
        1 X 3 = 3
        ...
        1 X 10 =10
            */
    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 10; num1++)
            for (int num2 = 1; num2 <= 10; num2++)
                System.out.println(" " + num1 + " x " + num2 + " = " + (num1 * num2) + " ");
    }

    {
        System.out.println();
    }
}



