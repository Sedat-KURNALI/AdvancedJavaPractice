package TECHNOSTUDY_USA.day99.RCalismalar;

public class MountainBicycle extends Bicycle{
    String mountain_wheels;
    boolean waterBottle;
    int gear2;
    boolean Break2;


    public void climb (int gear2){


    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "mountain_wheels='" + mountain_wheels + '\'' +
                ", waterBottle=" + waterBottle +
                ", gear2=" + gear2 +
                ", Break2=" + Break2 +
                ", name='" + name + '\'' +
                ", gear=" + gear +
                ", color='" + color + '\'' +
                ", light=" + light +
                ", speed=" + speed +
                ", Break1=" + Break1 +
                '}';
    }
}

