package com.lijingyao.dp.design.state;

/**
 * Created by lijingyao on 2017/11/7 11:00.
 */
public class TVRemote {


    public static void main(String[] args) {
        TVContext sc = new TVContext();
        //        State tvStartState = new TVStartState();
        //        State tvStopState = new TVStopState();


        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");

    }

}
