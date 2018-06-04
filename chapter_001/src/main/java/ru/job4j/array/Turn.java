package ru.job4j.array;
/**
 * Class Turn. Перевернуть массив.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 04.06.2018
 */
public class Turn {
    public int[] turn(int[] array) {
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j ];
            array[array.length - 1 - j] = temp;
        }
        return array;
    }
}
