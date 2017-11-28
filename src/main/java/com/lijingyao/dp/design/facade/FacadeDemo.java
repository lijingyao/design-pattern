package com.lijingyao.dp.design.facade;

/**
 * Created by lijingyao on 15/12/10 10:41.
 */
public class FacadeDemo {


    public static void main(String[] args) {
        // 3. Client uses the facade
        Line line1 = new Line(new Point(2, 4), new Point(5, 7));
        line1.move(-2, -4);
        System.out.println("after move:  " + line1);
        line1.rotate(45);
        System.out.println("after rotate: " + line1);
        Line line2 = new Line(new Point(2, 1), new Point(2.866, 1.5));
        line2.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + line2);
    }

    //    public static void main(String[] args) {
    //        StringBuilder sb = new StringBuilder();
    //        Random rand = new Random();
    //        for (int i = 0; i < 3; i++) {
    //            sb.append(rand.nextInt(10));
    //        }
    //        String data = sb.toString();
    //        System.out.println(" random data: " + data);
    //    }
}
