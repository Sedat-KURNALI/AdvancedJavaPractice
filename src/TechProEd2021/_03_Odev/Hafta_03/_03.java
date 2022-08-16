package TechProEd2021._03_Odev.Hafta_03;

import java.util.Scanner;

public class _03
    /*
	“NestedIfStatements” class olusturun.

    Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.

    Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin.
    Examples:
	int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
	int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
	Yusuf is Older
    */ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("A kişisi lütfen doğum yılınızı giriniz : ");
        int yearA = scan.nextInt();

        System.out.print("A kişisi lütfen doğum ayınızı giriniz : ");
        int monthA = scan.nextInt();

        System.out.print("A kişisi lütfen doğum gününüzü giriniz : ");
        int dayA = scan.nextInt();

        System.out.print("B kişisi lütfen doğum yılınızı giriniz : ");
        int yearB = scan.nextInt();

        System.out.print("B kişisi lütfen doğum ayınızı giriniz : ");
        int monthB = scan.nextInt();

        System.out.print("B kişisi lütfen doğm gününüzü giriniz : ");
        int dayB = scan.nextInt();

        if (yearA > yearB) {
            System.out.println("B kişisi A kişisinden büyüktür : ");
        } else if (yearA < yearB) {
            System.out.println("A kişisi B kişisinden büyüktür");
        }
        if (yearA == yearB) {
            if (monthA < monthB) {
                System.out.println("A kişisi B kişisinden büyüktür");
            } else if (monthA > monthB)
                System.out.println("B kişisi A kişisinden büyüktür");
            if (monthA == monthB) {
                if (dayA < dayB) System.out.println("A kişisi B kişisinden büyüktür");
                else if (dayA > dayB)
                    System.out.println("B kişisi A kşisinden büyüktür");
                else System.out.println("A kişisi ile B kişisi aynı yılın aynı ayının aynı gününde doğmuştur");
            }

        }
    }
}
