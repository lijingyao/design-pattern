package com.lijingyao.dp.design.facade;

/**
 * Created by lijingyao on 15/12/10 10:41.
 */
public class Line {
    private Point o, e;
    public Line( Point ori, Point end ) {
        o = ori;
        e = end;
    }
    public void  move( int dx, int dy ) {
        o.move( dx, dy );
        e.move( dx, dy );
    }
    public void  rotate( int angle ) {
        e.rotate( angle, o );
    }
    public String toString() {
        return "origin is " + o + ", end is " + e;
    }

}
