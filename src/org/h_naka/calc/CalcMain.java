package org.h_naka.calc;

public class CalcMain {
    public static void main(String args[]) {
        int length = args.length;
        if (length != 3) {
            System.out.println("USAGE java org.h_naka.calc.CalcMain 10 20 +");
            return;
        }

        CalcSub sub = new CalcSub(args);
        sub.start();
    }
}