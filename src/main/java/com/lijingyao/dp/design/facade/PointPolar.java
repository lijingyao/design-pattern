package com.lijingyao.dp.design.facade;

/**
 * Created by lijingyao on 15/12/10 10:42.
 */
public class PointPolar{

        private double radius, angle;
        public PointPolar( double r, double a ) {
            radius = r;
            angle = a;
        }
        public void  rotate( int ang ) {
            angle += ang % 360;
        }
        public String toString() {
            return "[" + radius + "@" + angle + "]";
        }

}
