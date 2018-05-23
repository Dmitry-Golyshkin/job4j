package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test for Maximum of two numbers.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 15.05.2018
 */
public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstLessSecondOrThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
