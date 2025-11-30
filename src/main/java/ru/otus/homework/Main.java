package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Apple app1 = new Apple("app1", 4);
        Apple app2 = new Apple("app2", 3);

        Orange or1 = new Orange("or1", 5);
        Orange or2 = new Orange("or2", 6);

        Apple app3 = new Apple("app3", 10);
        Apple app4 = new Apple("app4", 15);

        Orange or3 = new Orange("or3", 11);
        Orange or4 = new Orange("or4", 12);

//       Box<Apple> box1 = new Box<>();

        List<Apple> appList = new ArrayList<Apple>();
        appList.add(app1);
        appList.add(app2);

        List<Orange> orList = new ArrayList<Orange>();
        orList.add(or1);
        orList.add(or2);

        List<Apple> appList2 = new ArrayList<Apple>();
        appList2.add(app3);
        appList2.add(app4);

        List<Orange> orList2 = new ArrayList<Orange>();
        orList2.add(or3);
        orList2.add(or4);

//        System.out.println("Количество: " + box1.getCount());
//        System.out.println("Вес: " + box1.weight());
//
//        System.out.println("Удаляем: " + app2.getName() + " " + box1.takeFruit(app2));
//
//        System.out.println("Количество: " + box1.getCount());
//        System.out.println("Вес: " + box1.weight());

        Box<Apple, Orange> box1 = new Box<>(appList, orList);
        Box<Orange, Orange> box2 = new Box<>(orList, new ArrayList<Orange>());
        Box<Orange, Orange> box3 = new Box<>(orList2);
        Box<Apple, Orange> box4 = new Box<>(appList2, orList2);
        Box<Apple, Orange> box5 = new Box<>(appList2, orList2);


        System.out.println("Количество: " + box3.getCount());
        System.out.println("Вес: " + box3.weight());
        box3.pourOver(box2);
        System.out.println("Количество: " + box3.getCount());
        System.out.println("Вес: " + box3.weight());
        System.out.println("Количество: " + box2.getCount());
        System.out.println("Вес: " + box2.weight());

        System.out.println("Равны ли коробки?: " + box4.compare(box5));
        System.out.println("Равны ли коробки?: " + box3.compare(box5));
    }

}