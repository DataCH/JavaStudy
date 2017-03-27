package com.code.designPattern.builderpattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class Food {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void showFood() {
        System.out.println("Food name: " + this.name);
    }

}
