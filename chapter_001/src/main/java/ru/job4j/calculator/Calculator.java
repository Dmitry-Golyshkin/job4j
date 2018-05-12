package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 11.05.2018
 */

public class Calculator {
    private double result;  // summ operation

   public void add(double first, double second) {
        this.result = first + second;

    }

    public double getResult() {
        return this.result;
    }

    private double subtruck; // subtruck operation

    public void subtruck,(double first, double second) {
        this.subtruck = first - second;
    }

    public double getResult() {
        return this.subtruck;
    }

    private double div; // division operation

    public void add(double first, double second) {
        this.div = first / second;
    }

    public double getResult() {
        return this.div;
    }

    private double multiple; // multiplication operation

    public void add(double first, double second) {
        this.multiple = first * second;
    }

    public double getResult() {
        return this.multiple;
    }

}