package TECHNOSTUDY_ISMETBY.Gun46_47Encapsulation.Ex1;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    public void setYas(int yas) {
        //1. yöntem: setter method
        this.yas = Math.abs(yas);

       /* 2.yöntem;
        if (yas>0){
            this.yas=yas;
        }
        else {
            this.yas=-yas;
        }
         */

    }

    // getter method:
    public int getYas() {
        return this.yas;
    }
}





