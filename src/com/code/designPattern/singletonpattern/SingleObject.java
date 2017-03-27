package com.code.designPattern.singletonpattern;

/**
 * 饿汉式
 * Created by Acode on 2017/3/27.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    //让构造函数为private，这样该类就不会被实例化
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
