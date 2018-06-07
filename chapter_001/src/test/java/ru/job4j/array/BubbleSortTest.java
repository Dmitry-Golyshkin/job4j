package ru.job4j.array;

/**
 * @Test BubbleSort. Сортировка массива методом перестановки.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 07.06.2018
 */

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {11, -2, -7, 0, 10, 1, 7, 9, 20, 13};
        int[] result = sorter.Sort(input);
        int[] expect = new int[] {-7, -2, 0, 1, 7, 9, 10, 11, 13, 20};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {8, 11, 4, 3, 0};
        int[] result = sorter.Sort(input);
        int[] expect = new int[] {0, 3, 4, 8, 11};
        assertThat(result, is(expect));
    }
}