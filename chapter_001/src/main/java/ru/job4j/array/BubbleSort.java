package ru.job4j.array;

/**
 * Class BubbleSort. Сортировка массива методом перестановки.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 07.06.2018
 */

public class BubbleSort {
    public int[] Sort(int[] array) {
        int j = 0;
        int i = 0; // Счетчик пар (Cointer pairs)
        while (true) {
            if (array[j] > array[j + 1]) {
                int q = array[j];
                array[j] = array[j + 1];
                array[j + 1] = q;
                i = 0;
            } else {
                i++;
            }
            j++;
            if (j == array.length - 1) {
                j = 0;
            }
            if (i == array.length - 1)
                break;
        }
        return array;
    }
}

