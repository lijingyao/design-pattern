package com.lijingyao.dp.design.template;

/**
 * Created by lijingyao on 16/3/29 17:04.
 */
public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }

}