package com.ix8oio8xi.calculator;

public class CalcMain {
    public static void main(String[] args) {
        CalcParser parser = new CalcParser("2 ** 3 ** 2");
        System.out.println("Result: " + parser.parse().res);
    }
}
