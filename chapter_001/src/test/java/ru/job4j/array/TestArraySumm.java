package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestArraySumm {
    @Test
    public void WhenTwoSortedArrayToOne(){
        ArraySumm array = new ArraySumm();
        int[] arr1 = new int[] {1,3,7};
        int[] arr2 = new int[] {2,3,5,6};
        int[] result = array.arraysumm(arr1,arr2);
        int[] expect = new int[] {1,2,3,3,5,6,7};
        assertThat(result, is(expect));


    }

    @Test
    public void WhenTwoSortedArrayToOne_2(){
        ArraySumm array = new ArraySumm();
        int[] arr1 = new int[] {1,3,5,7,9,11,13};
        int[] arr2 = new int[] {2,4,6,8,8,10,11};
        int[] result = array.arraysumm(arr1,arr2);
        int[] expect = new int[] {1,2,3,4,5,6,7,8,8,9,10,11,11,13};
        assertThat(result, is(expect));


    }
}
