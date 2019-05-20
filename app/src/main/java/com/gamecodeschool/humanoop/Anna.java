package com.gamecodeschool.humanoop;

public class Anna extends Human {
    private int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    @Override
    public int getWeight() {
        return height;
    }

    @Override
    public void eat() {
        super.eat();
        weight=weight+2;


    }

    @Override
    public int birthday() {
        age=age+1;
      return age;
    }
}