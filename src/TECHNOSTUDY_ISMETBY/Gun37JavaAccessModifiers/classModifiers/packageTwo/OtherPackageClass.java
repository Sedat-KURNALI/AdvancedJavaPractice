package TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.classModifiers.packageTwo;


import TECHNOSTUDY_ISMETBY.Gun37JavaAccessModifiers.classModifiers.packageOne.PublicModifierClass;

// Diğer paketten defaulta erişemedik.
public class OtherPackageClass {
    public static void main(String[] args) {
        PublicModifierClass sm3 = new PublicModifierClass();
        //DefaultModifierClass sm1=new DefaultModifierClass();
    }
}
