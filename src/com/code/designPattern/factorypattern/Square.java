package com.code.designPattern.factorypattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
