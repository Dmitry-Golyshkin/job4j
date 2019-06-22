package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Dmitry Golyshkin (dmgoly@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder().
                                append("-----").
                                append("-   -").
                                append("-   -").
                                append("-----").
                                append(System.lineSeparator()).
                                toString()));
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
    @Test
    public void whenDrawTriangle(){
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Triangle());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder().
                                append("   +   ").
                                append("  + +  ").
                                append(" +   + ").
                                append("+++++++").
                                append(System.lineSeparator()).
                                toString()));

    }
}
