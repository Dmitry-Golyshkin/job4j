package ru.job4j.array;

/**
 * Class ArrayDuplicateTest.Тест для Удаление дубликатов в массиве.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 14.06.2018
 */


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

public class ArrayDuplicateTest {
    @Test
    public void WhenRemoveDuplicateThenArrayWithoutDuplicate(){
        String[] input = {"5","5","3","2","0","3"};
        String[] expect = {"0","2","3","5"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result,arrayContainingInAnyOrder(expect));
    }
}
