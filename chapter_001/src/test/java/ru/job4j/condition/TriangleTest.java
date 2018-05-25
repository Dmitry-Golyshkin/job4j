package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.*;
import static org.junit.Assert.*;

/**
 * Test for Calculating the area of a triangle.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 25.05.2018
 */

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(4, 1);
        Point b = new Point(0, 1);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6D;
        assertThat(result, closeTo(expected, 0.1));
    }
}

