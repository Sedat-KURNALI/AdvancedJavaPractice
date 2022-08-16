package TECHNOSTUDY_USA.day99.Replit.Solutions.ObjectClass2;

public class Family {
    int amountOfUser;
    int totalAmount;

    String familyName;
    String familyPrimaryUser;

    public void getTotalAmount(PhonePlan plan){
        totalAmount = plan.amount(amountOfUser) * amountOfUser;
    }

    public String toString() {
        return "\ntotal Amount is : " +totalAmount+
                "\nfamily name is : " + familyName +
                "\nprimary user is : " + familyPrimaryUser;
    }
}
