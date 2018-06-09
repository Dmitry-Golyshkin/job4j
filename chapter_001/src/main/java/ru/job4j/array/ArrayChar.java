package ru.job4j.array;

/**
 * Class ArrayChar. Слова начинается с...
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 07.06.2018
 */


public class ArrayChar {

    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();

        if (data.length >= value.length){
            for (int j = 0; j < value.length; j++) {
                if (data[j] != value[j]) {
                    result = false;
                }
            }
        }
        else {
            result = false;
        }
        return result;
    }
}

