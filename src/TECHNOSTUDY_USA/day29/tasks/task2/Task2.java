package TECHNOSTUDY_USA.day29.tasks.task2;
//***Part 2***
public class Task2 {

    public static void main(String[] args) {
        Login login1 = Login.createAdmin("techno", "1212qa");

        Login login2 = Login.createUser("hacker", "@#$&qwegg");

        login1.check();
        login2.check();
    }
}
