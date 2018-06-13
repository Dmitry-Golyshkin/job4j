package ru.job4j.array;

/**
 * Class MatrixCheck.Квадратный массив заполнен true или false по диагоналям.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 13.06.2018
 */


public class MatrixCheck {
   public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int k = 0; k < data.length - 1; k++) {
            if (data[0][0] != data[k][k]){
                result = false;
            }
            if (data[k][(data.length - 1) - k] != data[k + 1][(data.length - 1) - (k + 1) ]) {
                result = false;
            }
        }
        return result;
    }
}
