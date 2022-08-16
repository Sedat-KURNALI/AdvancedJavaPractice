package TECHNOSTUDY_USA.day37.uncheckedAndCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaCheckedException {

    public static void main(String[] args){
//        File file = new File("_duzenle.TECHNOSTUDY_USA.example.txt");

        //checked(expected) exception must be used with try-catch
        //we can predict it before we execute/do that
        try {
            FileInputStream fis = new FileInputStream("_duzenle.TECHNOSTUDY_USA.example.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}