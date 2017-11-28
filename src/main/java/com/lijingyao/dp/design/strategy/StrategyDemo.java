package com.lijingyao.dp.design.strategy;

/**
 * 　　在状态模式中，状态的变迁是由对象的内部条件决定，外界只需关心其接口，不必关心其状态对象的创建和转化；而策略模式里，采取何种策略由外部条件(C)决定。
 * Created by lijingyao on 15/12/16 10:39.
 */
public class StrategyDemo {

    public static void main(String args[]) {
        HardPolice hp = new HardPolice();
        NicePolice ep = new NicePolice();

        // In situation 1, a hard officer is met
        // In situation 2, a nice officer is met
        Situation s1 = new Situation(hp);
        Situation s2 = new Situation(ep);

        //the result based on the kind of police officer.
        s1.handleByPolice(10);
        s2.handleByPolice(10);
    }
}
