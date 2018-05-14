package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 11.05.2018
 */

public class Calculator {
        public double result;  // summ operation

   public void add(double first, double second) {
        this.result = first + second;

    }

    public double getResult() {
        return this.result;
    }

    private double div; // division operation

    public void add1(double first, double second) {
        this.div = first / second;
    }

    public double getResult1() {
        return this.div;
    }

    private double multiple; // multiplication operation

    public void add2(double first, double second) {
        this.multiple = first * second;
    }

    public double getResult2() {
        return this.multiple;
    }

    private double subtraction; // subtraction operation

    public void add3(double first, double second) {
        this.subtraction = first - second;
    }

    public double getResult3() {
        return this.subtraction;
    }
}