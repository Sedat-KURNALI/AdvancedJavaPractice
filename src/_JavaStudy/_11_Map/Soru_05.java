package _JavaStudy._11_Map;
// Kullanıcıya
// 1-Ekleme
// 2-Listeleme
// 3-Arama
// 4-Düzeltme
// 5-Çıkış
// Seçeneklerini vererek username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soru_05 {





    public static void main(String[] args) {
        //username    passwrod loginCount
        Map<String, Map<String, String>> users = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        int secim=0;
        do {
            System.out.println("**** Menü ****");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama"); // Kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
            System.out.println("4-Düzeltme"); // Kullanıcıdan bir username alıp bunun bilgilerinin değiştirilmesi sağlanacak
            System.out.println("5-Çıkış");
            System.out.print("Seçiminiz=");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    Ekleme(users);
                    break;
                case 2:
                    Listeleme(users);
                    break;
                case 3: Arama();
                    break;
                case 4: Duzeltme();
                    break;
            }

        } while (secim != 5);
    }

    public static void Listeleme(Map<String, Map<String, String>> users) {
        System.out.println("users = " + users);
    }

    public static void Ekleme(Map<String, Map<String, String>> users) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Username=");
        String username = scan.nextLine();

        System.out.print("Password=");
        String password = scan.nextLine();

        System.out.print("userType=");
        String userTipi = scan.nextLine();

        Map<String, String> bilgilerMap = new HashMap<>();  // burada bir kartvizit gibi mape atıldı
        bilgilerMap.put("password", password);
        bilgilerMap.put("userType", userTipi);

        users.put(username, bilgilerMap); // burada kullanıcının verdiği isme kartvizit gibi bilgiler atıldı
    }

    private static void Duzeltme() {
    }

    private static void Arama() {
    }
    /*
    //username   diğer bilgiler
        Map<String, Map<String,String>> users = new HashMap<>();

        Scanner oku=new Scanner(System.in);
        int secim=0;

        do{
            System.out.println("**** Menü ****");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama"); // Kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
            System.out.println("4-Düzeltme"); // Kullanıcıdan bir username alıp bunun bilgilerinin değiştirilmesi sağlanacak
            System.out.println("5-Silme");
            System.out.println("6-Çıkış");
            System.out.print("Seçiminiz=");
            secim=oku.nextInt();

            switch (secim)
            {
                case 1 : Ekleme(users); break;
                case 2 : //Listeleme(users); break;
                case 3 : //Arama(users); break;
                case 4 : //Duzeltme(users); break;
                case 5 : //Silme(users); break;
            }

            System.out.println("users = " + users);
        }while(secim < 6);
    }

    public static void Ekleme(Map<String, Map<String,String>> users)
    {
        Scanner oku=new Scanner(System.in);

        System.out.print("Username=");
        String username=oku.nextLine();

        System.out.print("Password=");
        String password=oku.nextLine();

        System.out.print("userType=");
        String userTipi=oku.nextLine();

        Map<String,String> user=new HashMap<>();
        user.put("password",password);
        user.put("userTipi",userTipi);

        users.put(username, user);
     */
}
