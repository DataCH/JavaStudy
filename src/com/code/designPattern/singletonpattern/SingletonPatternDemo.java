package com.code.designPattern.singletonpattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }

}
