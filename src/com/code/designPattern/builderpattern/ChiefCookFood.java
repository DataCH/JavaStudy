package com.code.designPattern.builderpattern;

/**
 * Created by Acode on 2017/3/27.
 */
public class ChiefCookFood extends CookFood {

    private Food food = new Food();

    @Override
    public void setFood(String name) {
        food.setName(name);
    }

    @Override
    public Food getFood() {
        return food;
    }
}
