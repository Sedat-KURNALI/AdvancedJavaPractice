package TECHNOSTUDY_USA.example.ClassesFieldsMethods;

class Modifiers {
    String name1; //Package Private
    public String name2; // We can use anywhere when we call
    protected String name3; // We can use only in this package - extend
    private String name4; // We can use only in this class
    final String name5 = "Ahmet";


    final void get(){}


    /*
    *
    Public Class (We can use anywhere when we import)
    Class Class (default) package-private (We can use only in same package)
    -------------------------------
    **
    Fields
    String name1; //Package Private
    public String name2; // We can use anywhere when we call
    protected String name3; // We can use only in this package - extend
    private String name4; // We can use only in this class
    final String name5 = "Ahmet"; When we initialize we can`t change later.
    ----------------------------------
    ***
    Methods
    public static void get(){}
    static void get(){}
    protected static void get(){}
    private static void get(){}
    final void get(){} //We can call in other class without creating its object.
    final static void get(){} //We can call in other class without creating its object.
   */

}
