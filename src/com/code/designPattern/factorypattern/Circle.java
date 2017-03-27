package com.code.designPattern.factorypattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
