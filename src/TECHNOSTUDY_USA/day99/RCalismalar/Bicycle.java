package TECHNOSTUDY_USA.day99.RCalismalar;

public class Bicycle {
    String name;
    int gear;
    String color;
    boolean light;
    double speed;
    boolean Break1;

    public Bicycle(){
    }

    public Bicycle(String name, int gear, String color, boolean light){
            this.name = name;
            this.gear = gear;
            this.color = color;
            this.light = light;

    }

    public double Speed (){
        System.out.println("Max speed is 50 mph");



        return speed;
    }

    public void Break(){


    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name='" + name + '\'' +
                ", gear=" + gear +
                ", color='" + color + '\'' +
                ", light=" + light +
                '}';
    }
}



