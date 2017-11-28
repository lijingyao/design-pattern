package com.lijingyao.dp.design.facade;

/**
 * Created by lijingyao on 15/12/10 10:42.
 */
public class Point {
    private PointCarte pc; // 2. Design a "wrapper" class

    public Point( double xx, double yy ) {
        pc = new PointCarte( xx,yy );
    }
    public String toString() {
        return pc.toString();
    }
    // 4. Wrapper maps
    public void move( int dx, int dy ) {
        pc.move( dx,dy );
    }
    public void rotate( int angle, Point o ) {
        double x = pc.getX() - o.pc.getX();
        double y = pc.getY() - o.pc.getY();
        PointPolar pp = new PointPolar( Math.sqrt(x*x+y*y),
                Math.atan2(y,x)*180/Math.PI );
        // 4. Wrapper maps
        pp.rotate( angle );
        System.out.println( "  PointPolar is " + pp );
        String str = pp.toString();  int i = str.indexOf( '@' );
        double r = Double.parseDouble( str.substring(1,i) );
        double a = Double.parseDouble( str.substring(i+1,str.length()-1) );
        pc = new PointCarte(r*Math.cos(a*Math.PI/180) + o.pc.getX(),
                r*Math.sin(a*Math.PI/180) + o.pc.getY() );
    }
}

