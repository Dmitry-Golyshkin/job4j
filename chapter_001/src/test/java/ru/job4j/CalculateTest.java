package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Dmitry Golyshkin (mailerema@gmail.com)
* @version $Id$
* @since 10.05.2018
*/
public class CalculateTest {
/**
* Test echo.
*/ @Test

public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Dmitry Golyshkin";
    String expect = "Echo, echo, echo : Dmitry Golyshkin"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}