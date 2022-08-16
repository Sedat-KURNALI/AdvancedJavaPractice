package TECHNOSTUDY_USA.day99.RCalismalar;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.name = "thunder";
        bicycle1.Break1 = true;
        bicycle1.color = "red";

        System.out.println((bicycle1.toString()));

        Bicycle bicycle2 = new Bicycle("Flash", 22, "orange", true);
        System.out.println(bicycle2.toString());

        MountainBicycle mountainBicycle1 = new MountainBicycle();
        mountainBicycle1.Break2 = true;
        mountainBicycle1.waterBottle = true;
        mountainBicycle1.gear2 = 5;
        mountainBicycle1.mountain_wheels = "Goodyear";
        mountainBicycle1.name = "Sarda";
        mountainBicycle1.color = "Black";
        System.out.println(mountainBicycle1.toString());

        //public void race (Bicycle b, MountainBicycle m, Tandembicycle t){

        //}
    }
}
