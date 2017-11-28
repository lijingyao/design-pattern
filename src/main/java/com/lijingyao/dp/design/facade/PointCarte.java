package com.lijingyao.dp.design.facade;

/**
 * Created by lijingyao on 15/12/10 10:42.
 */
public class PointCarte {
    private double x, y;
    public PointCarte( double xx, double yy ) {
        x = xx;
        y = yy;
    }
    public void  move( int dx, int dy ) {
        x += dx;
        y += dy;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}