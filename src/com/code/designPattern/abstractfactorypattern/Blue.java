package com.code.designPattern.abstractfactorypattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
