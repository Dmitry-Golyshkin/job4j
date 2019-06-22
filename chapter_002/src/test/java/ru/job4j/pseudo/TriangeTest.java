package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitry Golyshkin (dmgoly@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class TriangeTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder().
                                append("   +   ").
                                append("  + +  ").
                                append(" +   + ").
                                append("+++++++").
                                toString()));
    }
}

