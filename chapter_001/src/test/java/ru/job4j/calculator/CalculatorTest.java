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
    public void whenSubtruct2On1Then1() {
        Calculator calc = new Calculator();
        calc.subtruck(2D, 1D);
        double subtruck = calc.getResult();
        double expected = 1D;
        assertThat(subtruck, is(expected));
    }

    @Test
    public void whenDiv1On1Then1() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double div = calc.getResult();
        double expected = 1D;
        assertThat(div, is(expected));
    }

    @Test
    public void whenMultiple1On1Then1() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double multiple = calc.getResult();
        double expected = 1D;
        assertThat(multiple, is(expected));
    }




}