package TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.instanceModifiers.defaultModifier.other;


import TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.instanceModifiers.defaultModifier.same.Book;

public class AmazonStore {
    public static void main(String[] args) {
        //Book kitap1=new Book(); // default olduğundan
        // diğer paketten ulaşılamaz.

        Book kitap2 = new Book("yağmur");
        // bu constructor a ulaşabildim çünkü public
    }
}
