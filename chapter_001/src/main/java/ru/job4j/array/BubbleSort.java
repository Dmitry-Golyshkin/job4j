package ru.job4j.array;

/**
 * Class BubbleSort. Сортировка массива методом перестановки.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 07.06.2018
 */

public class BubbleSort {
    public int[] Sort(int[] array) {
        for(int i = 0; i < array.length; i++ ) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int q = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = q;
                }
            }
        }
        return array;
    }
}

