package com.lijingyao.dp.design.bridge;

/**
 * Created by lijingyao on 16/4/28 10:14.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}