package com.example.humanoop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
public class Human {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void  eat(){
        Log.d("Human","Iam eating food");
    }
    public void spleep(){
        Log.d("Human","zzzzzzzzzz")
    }
    public int sleep(int hours){
        Log.d("Human","I am sleeping for x hours");
        return hours;
    }
    public void speak (string speak){
        Log.d("Human","Today is sunday");
    }
    public int bithday (int increment){
        age = age+increment;
        return age;
    }
    public int addweight (int increment){
        weight = weight +
                increment;
        return weight''
    }

}


