package ru.job4j.array;
/**
 * Class ArraySumm. Merge two arrays.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 01.08.2018
 */

public class ArraySumm {
    public static int[] arraysumm(int[] arr1, int [] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int a = arr1.length - 1;
        int b = arr2.length - 1;
        int c = arr3.length;

        while (c > 0)
            arr3[--c] = (b < 0 || (a >= 0 && arr1[a] >= arr2[b])) ? arr1[a--] : arr2 [b--];
        return arr3;
    }
}
