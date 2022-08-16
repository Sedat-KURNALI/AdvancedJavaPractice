package TECHNOSTUDY_USA.day28.tasks.practiceTest1;

public class ElectricityAccount {
    double totalWph = 0;  //-> watt per hour
    double rate = 1.5;
    double bill;

    public double calculateBill() {
        bill = rate * totalWph;
        return bill;
    }


}
