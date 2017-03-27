package com.code.designPattern.abstractfactorypattern;

/**
 * Created by Acode on 2017/3/27.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}
