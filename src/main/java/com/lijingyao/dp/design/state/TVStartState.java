package com.lijingyao.dp.design.state;

/**
 * Created by lijingyao on 2017/11/7 10:58.
 */
public class TVStartState implements State {

    @Override
    public void doAction(TVContext context, String name){
        System.out.println("TV is turned ON");
        context.setState(new TVStopState());
    }


}
