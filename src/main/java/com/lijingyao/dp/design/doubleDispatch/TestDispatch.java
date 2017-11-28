package com.lijingyao.dp.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:37.
 */
public class TestDispatch {

    public static void main(String[] args) {
        Figure[] figures = new Figure[]{new Circle(), new Rectangle()};
        Printer[] printers = new Printer[]{new PostscriptPrinter(), new InkjetPrinter()};

        new Client().printAllEverywhere(figures, printers);
    }

}
