package ru.job4j.calculator;

/**
 * Test.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 11.05.2018
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDiv2On2Then1() {
        Calculator calc = new Calculator();
        calc.add1(2D, 2D);
        double div = calc.getResult1();
        double expected = 1D;
        assertThat(div, is(expected));
    }

    @Test
    public void whenMultiple1On1Then1() {
        Calculator calc = new Calculator();
        calc.add2(1D, 1D);
        double multiple = calc.getResult2();
        double expected = 1D;
        assertThat(multiple, is(expected));
    }

    @Test
    public void whenSubtraction2On1Then0() {
        Calculator calc = new Calculator();
        calc.add3(2D, 1D);
        double subtraction = calc.getResult3();
        double expected = 1D;
        assertThat(subtraction, is(expected));
    }
}