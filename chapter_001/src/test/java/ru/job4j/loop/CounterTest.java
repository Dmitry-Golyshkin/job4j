package ru.job4j.loop;

/**
 * Test.
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 28.05.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
       @Test
       public void whenSumEvenNumbersFromOneToTenThenThirty() {
       Counter count = new Counter();
       int result = count.add(1, 10);
       assertThat(result , is (30));

    }
}