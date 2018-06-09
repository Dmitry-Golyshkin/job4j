package ru.job4j.array;

/**
 * @Test ArrayChar. Слова начинается с...
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 07.06.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse_2() {
        ArrayChar word = new ArrayChar("World");
        boolean result = word.startWith("Wod");
        assertThat(result, is(false));
    }
    @Test
    public void whenThePrefixIsLongerThanTheWorld() {
        ArrayChar word = new ArrayChar("World");
        boolean result = word.startWith("Wodtrewq");
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixThenTrue2() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Helloo");
        assertThat(result, is(false));
    }
}
