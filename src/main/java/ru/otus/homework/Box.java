package ru.otus.homework;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit, A extends Fruit> {
    private List<T> fructis1 = new ArrayList<>(15);
    private List<A> fructis2 = new ArrayList<>(0);

    public Box(List<T> fructis1, List<A> fructis2) {
        this.fructis1 = fructis1;
        this.fructis2 = fructis2;
    }

    public Box(List<T> fructis1) {
        this.fructis1 = fructis1;
    }

    public List<T> getListT() {
        return this.fructis1;
    }

    public List<A> getListA() {
        return this.fructis2;
    }

    public void addFruitT(T fr) {
        this.fructis1.add(fr);
    }

    public void addFruitA(A fr) {
        this.fructis2.add(fr);
    }


    public boolean takeFruitT(T fr) {
        return this.fructis1.remove(fr);
    }

    public boolean takeFruitA(A fr) {
        return this.fructis2.remove(fr);
    }

    public boolean compare(Box box1) {
        return box1.weight() == this.weight();
    }

    public int getCount() {
        return fructis1.size() + fructis2.size();
    }

    public int weight() {
        int res = 0;
        for (int i = 0; i < fructis1.size(); i++) {
            res += fructis1.get(i).getHelf();
        }
        for (int i = 0; i < fructis2.size(); i++) {
            res += fructis2.get(i).getHelf();
        }
        return res;
    }

    public void pourOver(Box<T, A> box) {

        this.fructis1.addAll(box.getListT());
        box.getListT().clear();

        this.fructis2.addAll(box.getListA());
        box.getListA().clear();
    }

}
