package ru.job4j.array;

/**
 * Заполнить массив степенями чисел. Тест.
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 04.06.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then1_4_9_16_25() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }
}