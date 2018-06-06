package ru.job4j.array;
/**
 * Class Check. Массив заполнен true или false.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 06.06.2018
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int j = 0; j < data.length - 1; j++) {
            result = data[j] == data[j + 1];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
