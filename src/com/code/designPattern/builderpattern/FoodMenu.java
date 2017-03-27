package com.code.designPattern.builderpattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class FoodMenu {

    private CookFood cookFood = new ChiefCookFood();

    public Food getFoodA() {
        cookFood.setFood("food A");
        return cookFood.getFood();
    }

    public Food getFoodB() {
        cookFood.setFood("food B");
        return cookFood.getFood();
    }

}
