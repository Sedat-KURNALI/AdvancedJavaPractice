package TECHNOSTUDY_USA.day19;

public class JavaMethodReturnType2 {
    //Michael Jackson
    //initials: M. J.

    public static void main(String[] args) {
        String firstName = "Michael";
        String lastName = "Jackson";

        String nameInitial= initial(firstName);
        String surnameInitial= initial(lastName);
        System.out.println(nameInitial+surnameInitial);

        initial(firstName);

        System.out.println(initial("Furkat") + initial("Ali"));
        System.out.println(initial("Yusuf") + initial("Esenboga"));
    }

    public static String initial(String name) {
        return name.charAt(0) + ".";
    }

}
