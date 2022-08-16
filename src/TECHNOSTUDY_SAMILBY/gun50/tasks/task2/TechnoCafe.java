package TECHNOSTUDY_SAMILBY.gun50.tasks.task2;

import TECHNOSTUDY_SAMILBY.gun50.tasks.task2.food.Beshbarmak;
import TECHNOSTUDY_SAMILBY.gun50.tasks.task2.food.Food;
import TECHNOSTUDY_SAMILBY.gun50.tasks.task2.food.Kebab;
import TECHNOSTUDY_SAMILBY.gun50.tasks.task2.food.Maklube;

public class TechnoCafe {

    public static void main(String[] args) {
        Food beshparmak = new Beshbarmak();
        beshparmak.print();

    }

    public static void part1(){
        Food kebab = new Kebab();

        Food maklube = new Maklube();

        Kitchen fetihKitchen = new Kitchen();

        System.out.println("---------kebab----------");
        fetihKitchen.cook(kebab);

        System.out.println("---------maklube----------");
        fetihKitchen.cook(maklube);
    }
}
