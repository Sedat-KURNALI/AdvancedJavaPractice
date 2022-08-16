package TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.instanceModifiers.publicModifier.other;


import TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.instanceModifiers.publicModifier.same.SearchEngine;

public class EdgeBrowser {

    public static void main(String[] args) {
        // diğer oaketteki bu constructor a ulaşabildim.
        // çünkü public.
        SearchEngine microsoft = new SearchEngine("explorer");
        microsoft.name = "Edge"; // diğer paketteki bu fileda ulaşabildim

        System.out.println("microsoft = " + microsoft);
    }
}
