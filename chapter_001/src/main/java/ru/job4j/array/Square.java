package ru.job4j.array;
/**
 * Class Square. Заполнить массив степенями чисел.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 04.06.2018
 */
public class Square {

    /**
     * Метод возвращает массив с числами возведёнными в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
