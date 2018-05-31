package ru.job4j.loop;
/**
 * @Test.
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 31.05.2018
 */
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;



public class PaintTest {
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenPyramid2Full() {
        Paint paint = new Paint();
        String result = paint.pyramid(2);
        final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", line, line);
        assertThat(result, is(expected));
    }
    @Test
    public void whenPyramid4Full() {
        Paint paint = new Paint();
        String result = paint.pyramid(4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("   ^   %s  ^^^  %s ^^^^^ %s^^^^^^^%s", line, line, line,line);
        assertThat(result, is(expected));
    }
}