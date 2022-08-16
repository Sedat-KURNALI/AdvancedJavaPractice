package JavaCybertekSchool_2020.day48_Inheritance.Device;
/*
create a class called Device
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize,
                    methods: setInfo, toString
 */
public class Device {

    public String model;
    public String brand;
    public double price;
    public static String madeIn;
    public static boolean isElectronic;
    public boolean hasBattery;
    public boolean hasMemory;
    public int screenSize;
     static{
         madeIn = "China";
         isElectronic = true;
     }

    public void setInfo(String model, String brand, double price, boolean hasBattery, boolean hasMemory, int screenSize) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasMemory = hasMemory;
        this.screenSize = screenSize;
    }
    public String toString(){
        return "Brand: "+brand+" model: "+model+" Made in: "+ madeIn+ " price: "+price+ "\nDoes it have a battery: "+hasBattery+ " Does it have a memory: "+hasMemory+ " Screen size: "+screenSize+" Is it electronic: "+isElectronic;
    }


}
