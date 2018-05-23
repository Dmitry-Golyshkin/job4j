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
    public int max(int first, int second, int third) {
          return Math.max((Math.max(first,second)),third);
    }
}
