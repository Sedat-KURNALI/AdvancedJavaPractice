package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects2;

public class PhonePlan {
    String planType;
    int priceForEach;

    public int amount(int user) { //totalUser from Family class

        if (planType.equals("eco") && user <= 3) {
            priceForEach = 50;
        } else if (planType.equals("eco") && user > 3 && user <= 5) {
            priceForEach = 45;
        } else if (planType.equals("eco") && user > 5) { //7*35=
            priceForEach = 35;
        } else if (planType.equals("premium") && user <= 3) {
            priceForEach = 70;
        } else if (planType.equals("premium") && user > 3 && user <= 5) {
            priceForEach = 60;
        } else if (planType.equals("premium") && user > 5) {
            priceForEach = 55;
        }
        return priceForEach;
    }
}
    /*
  Create instance variables OK
    1 String - planType OK
    1 Integer - priceForEach OK
  Create one method name is amount
    Parameter is 1 int (totalUser from Family class)
    if planType equal to eco and int is less or equal to 3
      priceForEach is 50
    if planType equal to eco and int is bigger then 3
    and less or equal 5 ==> priceForEach is 45
    if planType equal to eco and int is bigger then 5
      priceForEach is 40
    if planType equal to premium and int is less or equal to 3
      priceForEach is 70
    if planType equal to premium and int is bigger then 3
    and less or equal 5 ==> priceForEach is 60
    if planType equal to premium and int is bigger then 5
      priceForEach is 55
 return the priceForEach
     */

