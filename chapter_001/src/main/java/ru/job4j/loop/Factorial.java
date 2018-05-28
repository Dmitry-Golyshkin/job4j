package ru.job4j.loop;

/**
 * Counter.(This programm for Counting the sum of even numbers in the range).
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 28.05.2018
 */

public class Factorial {
    public static void main(String[] args) {
    }

    public int factorial( int i){
        int fact = 1;
        for (;i > 0; fact*= i-- );
       return fact;
     }






}
