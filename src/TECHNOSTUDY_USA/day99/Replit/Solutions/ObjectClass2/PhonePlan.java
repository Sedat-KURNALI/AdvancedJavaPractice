package TECHNOSTUDY_USA.day99.Replit.Solutions.ObjectClass2;

public class PhonePlan {
    String planType;
    int priceForEach;

    public int amount(int totalUser){
        if (planType.equals("eco") && totalUser <= 3) {
            priceForEach = 50;
        }else if (planType.equals("eco") && totalUser > 3 && totalUser <= 5) {
            priceForEach = 45;
        }else if (planType.equals("eco") && totalUser > 5) {
            priceForEach = 35;
        }else if (planType.equals("premium") && totalUser <= 3) {
            priceForEach = 70;
        }else if (planType.equals("premium") && totalUser > 3 && totalUser <= 5) {
            priceForEach = 60;
        }else if (planType.equals("premium") && totalUser > 5) {
            priceForEach = 55;
        }
        return priceForEach;
    }
}
