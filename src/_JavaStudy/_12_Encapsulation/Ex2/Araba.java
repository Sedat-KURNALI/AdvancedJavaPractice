package _JavaStudy._12_Encapsulation.Ex2;

public class Araba {

 private String model;
    private  String renk;
    private int motor;
    private int yil;
public Araba(){//parametresiz constructor atadık parametreli cons default conts ezdiği için

}
  //parametreli constructor ...sağ tık--> Generate-->Constructor...
    public Araba(String model, String renk, int motor, int yil) {

        // this.model = model;
        // this.renk = renk;
        // this.motor = motor;
        // this.yil = yil;

        //cons obj parametrelerini hatalı üretmesin diye field yani dğerleri encapsule ederek get set metodlarında gönderilmeli
        // yoksa yıl volvoda hatalı -2020 girilir
        setModel(model);
        setRenk(renk);
        setMotor(motor);
        setYil(yil);
    }
    //getter setter methodları...sağ tık--> Generate-->Getter and Setter...

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil>0) {
            this.yil = yil;
        }else
            System.out.println("yılı negatif  olamaz...");

    }
}
