package TECHNOSTUDY_ISMETBY.Gun41_42LocalDateTime._4_Odev;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Registration userReg = new Registration();

        ArrayList<User> register = userReg.register();

        userReg.printHappyUsers(register);

    }

}