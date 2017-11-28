package com.lijingyao.dp.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:36.
 */
public class PostscriptPrinter implements Printer {

    public void printCircle(Circle circle) {
        // ... postscript preprocessing logic for circles here ...
        System.out.println("PostScript printer prints a cirlce.");
    }

    public void printRectangle(Rectangle rectangle) {
        // ... postscript preprocessing logic for rectangles here ...
        System.out.println("PostScript printer prints a rectangle.");
    }
}
