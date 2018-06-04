package ru.job4j.array;
/**
 * Перевернуть массив. Тест.
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 04.06.2018
 */

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;



public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.turn(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {2, 3, 8, 9, 1, 0};
        int[] result = turner.turn(input);
        int[] expect = new int[] {0, 1, 9, 8, 3, 2};
        assertThat(result, is(expect));
    }

}
