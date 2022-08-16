package TECHNOSTUDY_USA.day28.tasks.practiceTest1;

public class Customer {
    String name;
    ElectricityAccount electricityAccount;

    public Customer(String firstname){
        this.name = firstname;

    }

    public double consumeElectricity (){
        ElectricityAccount E = new ElectricityAccount();
        E.totalWph += 100;
        E.totalWph += 200;
        E.totalWph +=  50;
        return E.totalWph;
    }
    public String toString (){
        return "\nYour Name is : "+name+
                "\nYour Account is : "+electricityAccount+
                "\nYour Bill is : "+getBill();
    }
    public double getBill(){
        ElectricityAccount el = new ElectricityAccount();
        double resultBill = el.calculateBill();
        return resultBill;
    }

}
