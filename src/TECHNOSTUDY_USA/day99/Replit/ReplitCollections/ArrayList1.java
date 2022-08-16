package TECHNOSTUDY_USA.day99.Replit.ReplitCollections;

import java.util.ArrayList;

public class ArrayList1 {
    /*
Create one method name is getCount() <<<OK>>> 1
Parameter is one String ArrayList , one String <<<OK>>> 2
return type is int. <<<OK>>> 3    METHOD ISMI VE BODY

42 <<<OK>>> Count,  43 how many times your parameter String occurs in the arraylist, 41 <<<OK>>> return the count. 4
     */


    public static int getCount(ArrayList<String> benimStringTrenim, String boksit) {

        int count = 0;


        for (int i = 0; i < benimStringTrenim.size(); i++) {
            if (boksit.equals(benimStringTrenim.get(i))){
                count++;
            }
        }

        return count;
    } //METHOD BODY ENDS.



    /*
    public static int getCount(ArrayList<String> list, String str){
        int c=0;
        for (int i = 0; i <list.size() ; i++) {
            if (str.equals(list.get(i))) c++;
        }
        return c;
    }
    */
}

/*
int count = 0; // default  HA  BEBEK

        for (int i = 0; i <benimStringTrenim.size() ; i++) {  // PARAMETRE 1 - GENCLIK - FOR LOOP ARRAYLISTIN ELEMANLARINI TEK TEK TARIYOR
            if( boksit.equals(benimStringTrenim.get(i)) ) {  //PARAMETRE 2 if ( CONDITION ) { BODY }    if (CONDITION) ? TRUE : FALSE
                count++; //ZIKIRMATIgi tikla
            }
        }
 */