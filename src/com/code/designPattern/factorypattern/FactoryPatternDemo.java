package com.code.designPattern.factorypattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle的对象，并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取Rectangle的对象，并调用它的draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //获取Square的对象，并调用它的draw方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }

}
