package TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.instanceModifiers.publicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {

        // public olduğundan rahatlıkla ulaşabiliyorum aynı paket içinden.
        SearchEngine google = new SearchEngine("crome");
        google.name = "Crome"; // public

        System.out.println("google = " + google);
        // toString metoduna gider o da public
    }
}
