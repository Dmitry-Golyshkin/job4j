package ru.job4j.max;
/**
 * Maximum of two numbers.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 15.05.2018
 */

public class Max {
    public int max(int first, int second) {
        return Math.max(first,second);
    }
    int x;
    public int max(int first, int second, int third) {
        x = Math.max(first,second);
        return Math.max(x,third);
    }
}
