package com.lijingyao.dp.design.state;

/**
 * Created by lijingyao on 2017/11/7 10:58.
 */
public class TVContext {

    private State tvState;

    public TVContext() {
        this.tvState = new TVStopState();
    }

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    //request 方法，转发给具体的state 处理
    public void writeName(String name) {
        this.tvState.doAction(this, name);
    }


}