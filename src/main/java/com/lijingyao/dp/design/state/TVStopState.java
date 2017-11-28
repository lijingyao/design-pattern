package com.lijingyao.dp.design.state;

/**
 * Created by lijingyao on 2017/11/7 10:58.
 */
public class TVStopState implements State {
    /**
     * Counter local to this state
     */
    private int count = 0;

    @Override
    public void doAction(TVContext context, String name) {
        System.out.println("TV is turned OFF");

         /* Change state after StateMultipleUpperCase's writeName() gets invoked twice */
        if (++count > 1) {
            context.setState(new TVStartState());
        }
    }

}