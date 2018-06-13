package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int column = 0; column < size; column++) {
            for (int line = 0; line < size; line++) {
                matrix[column][line] = (column + 1) * (line + 1);
            }
        }
        return matrix;
    }
}
