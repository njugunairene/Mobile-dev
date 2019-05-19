package com.example.humanoop;

public class Anna extends Human{
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }
    private int height;

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }
}
public int weight(int increment) {
    weight = weight + increment;
    return weight;
}
