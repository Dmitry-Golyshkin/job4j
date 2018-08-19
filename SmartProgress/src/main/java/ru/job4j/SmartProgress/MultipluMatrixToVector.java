package ru.job4j.SmartProgress;

/**
 * Multiple Matrix To Vector.
 * @autor Dmitry Golyshkin (mailto: mailerema@gmail.com)
 * @version $Id$
 * @sinse 19.08.18
 */


public class MultipluMatrixToVector {
    public int[] multiplyMatrixToVector (int matrix[][], int[] vector) {
        int[] rst = new int[vector.length];
        int i = 0;
        for (int row = 0; row < vector.length; row++) {
            for (int columm =0; columm <vector.length; columm++) {
                i += matrix[row][columm] * vector[columm];
            }
            rst[row] = i;
            i = 0;
        }
        return rst;
    }

}
