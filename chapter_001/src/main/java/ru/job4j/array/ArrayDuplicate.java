package ru.job4j.array;

/**
 * Class ArrayDuplicate. Удаление дубликатов в массиве.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 14.06.2018
 */

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array){
        int unique = array.length;
        for (int out = 0; out != unique; out++){
            for (int in = out + 1; in != unique; in++){
                if (array[out].equals(array[in])){
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
