package ru.job4j.loop;

/**
 * Counter.(This programm for Counting the sum of even numbers in the range).
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 28.05.2018
 */

public class Counter {
    public static void main(String[] args) {
    }

    public int add(int start, int finish){
        int i, sum = 0;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0){
                sum = sum +i;
            }
        }
            return sum;
    }
}
