package com.lijingyao.dp.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:38.
 */
public class Client {

    /**
     * Prints all figures on each of the printers.
     */
    void printAllEverywhere(Figure[] figures, Printer[] printers) {
        for (int i = 0; i < figures.length; i++) {
            Figure figure = figures[i];
            for (int j = 0; j < printers.length; j++) {
                Printer printer = printers[j];

                figure.printOn(printer);
                // must work for any printer or figure !
            }
        }
    }

}
