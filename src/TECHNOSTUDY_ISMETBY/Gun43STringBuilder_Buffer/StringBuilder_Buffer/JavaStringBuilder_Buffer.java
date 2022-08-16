package TECHNOSTUDY_ISMETBY.Gun43STringBuilder_Buffer.StringBuilder_Buffer;

import java.util.Arrays;

public class JavaStringBuilder_Buffer {
    public static class JavaStrings {

        public static void main(String[] args) {

            String cumle = "";
            cumle += "Bugün";
            cumle += " hava"; // String değişkeni çok fazla ekleme veya işlemlere göre perfomansı oldukça düşük.

            // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
            // yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.
            // String, Gun43StringBuilder_Buffer.JavaRuntimeException.StringBuilder, StringbBffer.... Gun43StringBuilder_Buffer.JavaRuntimeException.StringBuilder; Dolmus söföru gibi geleni aliyor
            //StringBuffer de TAKSİ ler gibi çalışır

            StringBuilder s = new StringBuilder("Bu");

            s.append("gün");// add gibi ekleme yapıyor bu yüzden tekrar atamaya gerek yok.
            s.append(" hava");
            s.append(" çok sıcak");

            System.out.println("s = " + s);
            System.out.println("s.lenght = " + s.length());

            s.append("mı");//ne eklenirse eklnesin hepsi stringe dönüşüyor
            System.out.println("s = " + s);

            s.reverse();//Stringi tersine çeviriyor.
            System.out.println("s = " + s);

            s.delete(0, 5);// 0-5 arasındaki (01234) indeksdeki karakterleri siliyor.
            System.out.println("s = " + s);

            s.deleteCharAt(3); //sadece 0 indexten itibaren verilen indexteki karakteri siler
            System.out.println("s = " + s);

            System.out.println("s.length() = " + s.length());//değişken içindeki karakter sayısını verir.
            System.out.println("s.capacity() = " + s.capacity());//hafizada genişleyebilmesi için verilmiş ön alan , ancak eklendikçe artan bir alan . tampon genişleyebilme alanı.

            s.insert(5, 17);//5 nolu indexe 17 koydu.
            System.out.println("s = " + s);

            s.insert(5, 3.14);//5 nolu indexe 3.14 double stringe çevirerek ekledi
            System.out.println("s = " + s);

            int[] dizi = {2, 3, 5, 89, 17};
            s.insert(6, Arrays.toString(dizi));// dizi insert edildi.
            System.out.println("s = " + s);


            s = new StringBuilder("BugunHavaÇokSıcak");
            System.out.println("s = " + s);
            s.replace(3, 8, "bu");// başlangıç ve son verilen bölüme verilen stringi atar, eğer verilen büyük ise aradaki
            // bölüm delete olur. üst sınır hariç
            System.out.println("s = " + s);

        }
    }
}
