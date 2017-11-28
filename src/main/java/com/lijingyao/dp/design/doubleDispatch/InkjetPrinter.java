package com.lijingyao.dp.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:36.
 */
public class InkjetPrinter implements Printer {

    public void printCircle(Circle circle) {
        // ... rasterizing logic for inkjet printing of circles here ...
        System.out.println("Inkjet printer prints a cirlce.");
    }

    public void printRectangle(Rectangle rectangle) {
        // ... rasterizing logic for inkjet printing of rectangles here ...
        System.out.println("Inkjet printer prints a rectangle.");
    }
}
