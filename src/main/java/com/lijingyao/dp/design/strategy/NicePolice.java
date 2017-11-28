package com.lijingyao.dp.design.strategy;

/**
 * Created by lijingyao on 15/12/16 10:37.
 */
public class NicePolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("This is your first time, be sure don't do it again!");
    }
}
