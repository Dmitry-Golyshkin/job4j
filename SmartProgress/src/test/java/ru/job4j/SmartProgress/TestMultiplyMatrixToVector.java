package ru.job4j.SmartProgress;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestMultiplyMatrixToVector {
    @Test
    public void TestMultiplyMatrixToVector() {
        MultipluMatrixToVector multiply = new MultipluMatrixToVector();
        int[][] matrix = {
                {2, 4, 0},
                {-2, 1, 3},
                {-1, 0, 1}
        };
        int[] vector = {1, 2, -1};
        int[] expect = {10, -3, -2};
        int[] result = multiply.multiplyMatrixToVector(matrix, vector);
        assertThat(result, is(expect));
    }

    @Test
    public void TestMultiplyMatrixToVector2() {
        MultipluMatrixToVector multiply = new MultipluMatrixToVector();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 8, -7}
        };
        int[] vector = {2, 3, -5};
        int[] expect = {-7, -7, 61};
        int[] result = multiply.multiplyMatrixToVector(matrix, vector);
        assertThat(result, is(expect));
    }
}
