package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects2;

public class Family {
    int amountOfUser;
    int totalAmount;

    String familyName;
    String familyPrimaryUser;

    public void getTotalAmount(PhonePlan name) {
        totalAmount = name.amount(amountOfUser) * amountOfUser;
    }
       public String toString(){
        return "\n Total Amount is : " + totalAmount +
                "\n Family Name is : " + familyName +
                "\n Primary User is : " + familyPrimaryUser;
       }
}

    /*
  Create instance variables
    2 Integer - amountOfUser , totalAmount
    2 String - familyName , familyPrimaryUser
  Create one method name is getTotalAmount
    Parameter is PhonePlan (next Class)
    This method will call the amount method from the PhonePlan class
    and multiply the result with amountOfUser
    result should be equal to totalAmount
     print  total Amount is : totalAmount
     family name is : familyName
     primary user is : familyPrimaryUser
  Use toString method while printing
     */

