package TECHNOSTUDY_ISMETBY.Gun22javaMethods_Create_Call_Void_Return;

public class JavaMethods2 {
    public static void main(String[] args) {
        merhabaYaz();

        //System.out.println("ismet");
        ismeMerhabaYaz("ismet");
        ismeMerhabaYaz("Ayşe");
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba ");
    }

    //ismeMerhabaYaz("ismet");
    public static void ismeMerhabaYaz(String isim) {
        System.out.println("Merhaba " + isim);
    }
}
