package com.code.designPattern.factorypattern;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象
 * Created by Acode on 2017/3/27.
 */
public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (null == shapeType) {
            return null;
        }
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
