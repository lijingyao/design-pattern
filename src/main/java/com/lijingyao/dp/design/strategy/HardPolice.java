package com.lijingyao.dp.design.strategy;

/**
 * Created by lijingyao on 15/12/16 10:37.
 */
public class HardPolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("Your speed is " + speed + ", and should get a ticket!");
    }
}
