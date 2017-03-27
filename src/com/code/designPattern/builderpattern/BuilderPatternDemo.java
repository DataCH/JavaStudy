package com.code.designPattern.builderpattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        FoodMenu foodMenu = new FoodMenu();
        Food foodA = foodMenu.getFoodA();
        foodA.showFood();
        Food foodB = foodMenu.getFoodB();
        foodB.showFood();
    }
}
