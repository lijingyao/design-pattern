package com.lijingyao.dp.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:35.
 */
public class Rectangle implements Figure {
    public void printOn(Printer printer) {
        printer.printRectangle(this);
    }
}

