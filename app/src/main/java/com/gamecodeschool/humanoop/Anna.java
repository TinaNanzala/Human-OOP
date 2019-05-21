package com.gamecodeschool.humanoop;

import android.util.Log;

public class Anna extends Human {
    private int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWeight() {
        return height;
    }

    @Override
    public void eat() {
        super.eat();
    int annaWeight=getWeight();
    annaWeight=annaWeight+2;
    setWeight(annaWeight);

    }

    @Override
    public void birthday() {
    int newAge=getAge();
    newAge=newAge+4;
    setAge(newAge);
    }
}
