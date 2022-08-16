package JavaCybertekSchool_2020.day48_Inheritance.Device;
/*
create a sub class of device called phone:
					attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory
					methods: call, text, setInfo, toString

					add a constructor that can set the fileds
 */
public class Phone extends Device {
    public boolean hasSimCard;
    public String OS;
    public Phone(String model, String brand, double price, boolean hasBattery, boolean hasMemory, int screenSize, boolean hasSimCard, String OS){
        setInfo(model, brand, price, hasBattery, hasMemory, screenSize);
        this.hasSimCard=hasSimCard;
        this.OS=OS;
    }
    public void Call(){
        System.out.println("Calling on:"+brand+" "+model);
    }
    public void Text(){
        System.out.println("Texting to:"+brand+" "+model);
    }
}
