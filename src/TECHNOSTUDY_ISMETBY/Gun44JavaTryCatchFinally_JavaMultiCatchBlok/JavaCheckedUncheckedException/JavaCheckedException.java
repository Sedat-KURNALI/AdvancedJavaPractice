package TECHNOSTUDY_ISMETBY.Gun44JavaTryCatchFinally_JavaMultiCatchBlok.JavaCheckedUncheckedException;

import java.io.FileInputStream;

public class JavaCheckedException {
    public static void main(String[] args) {

        // Dosya okuma/yazma işlemi
        // bu işlemlerde hata olasılığı yüksek olduğundan
        // hata kontrolü zorunlu tutuluyor.
        // bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
        // bu gibi surumlara karşılk gelen hatalara Checked Exception denir.
        // Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.
        try {
            FileInputStream file = new FileInputStream("dosya.txt");
        } catch (Exception ex) {

        }
    }
}
