package TECHNOSTUDY_USA.example.ENUM1;

import java.util.ArrayList;
import java.util.Arrays;

    public class Phones {
        public String names;
        Category phoneCategory;

        public Phones(String names, Category phoneCategory) {
            this.names = names;
            this.phoneCategory=phoneCategory;
        }

    }

    class Main{
        public static void main(String[] args) {
           // Category a = new Category(); We can`t create enum objects

            Phones furkat = new Phones("Furkat", Category.IPHONE );
            Phones samil = new Phones ("Samil", Category.SAMSUNG);
            Phones umare = new Phones("Umare", Category.IPHONE);
            Phones rahima = new Phones ("Rahima", Category.BLACKBERRY);
            Phones serdar = new Phones ("Serdar", Category.BLACKBERRY);
            Phones yusuf = new Phones ("Yusuf", Category.SAMSUNG);

            ArrayList<Phones> newlist= new ArrayList<>(Arrays.asList(furkat, samil, umare, rahima, serdar, yusuf));

            newlist.add(furkat);
            newlist.add(samil);
            newlist.add(umare);
            newlist.add(rahima);
            newlist.add(serdar);
            newlist.add(yusuf);

            for (Phones phones : newlist) {
                if (Category.BLACKBERRY == phones.phoneCategory){
                    System.out.println(phones.names);
                }
            }
        }

    }

