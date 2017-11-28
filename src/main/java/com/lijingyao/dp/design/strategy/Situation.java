package com.lijingyao.dp.design.strategy;

/**
 * Created by lijingyao on 15/12/16 10:38.
 */
public class Situation {
    private Strategy strategy;

    public Situation(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handleByPolice(int speed) {
        this.strategy.processSpeeding(speed);
    }
}