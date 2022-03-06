package com.springbootReactiveProgramming.springbootreactiveprogramming.domain;

public class Dish {
    private String name;
    private boolean state;

    public Dish(String name) {
        this.name = name;
    }

    public static Dish deliver(Dish dish) {
        dish.setState(true);
        return dish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
