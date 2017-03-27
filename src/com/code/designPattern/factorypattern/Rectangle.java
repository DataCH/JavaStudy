package com.code.designPattern.factorypattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
