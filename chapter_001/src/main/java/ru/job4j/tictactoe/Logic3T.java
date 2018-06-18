package ru.job4j.tictactoe;

/**
 * Class Logic3T. Логика игра крестики/нолики.
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 18.06.2018
 */


public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean value = true;
        //Check the diagonal (left top, right bottom).
        if (table[0][0].hasMarkX() == value && table[1][1].hasMarkX() == value && table[2][2].hasMarkX() == value ){
          return true;
        }
        //Check the diagonal (left bottom,right top).
        if (table[2][0].hasMarkX() == value && table[1][1].hasMarkX() == value && table[0][2].hasMarkX() == value) {
            return true;
        }
        //Check the row.
        for (int row = 0; row != table.length; row++) {
            if (table[row][0].hasMarkX() == value && table[row][1].hasMarkX() == value && table[row][2].hasMarkX() == value) {
                return true;
            }
        }
        //Check the column.
        for (int column = 0; column != table.length; column++) {
            if (table[0][column].hasMarkX() == value && table[1][column].hasMarkX() == value && table[2][column].hasMarkX() == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinnerO() {
        boolean value = true;
        //Check the diagonal (left top, right bottom).
        if (table[0][0].hasMarkO() == value && table[1][1].hasMarkO() == value && table[2][2].hasMarkO() == value) {
            return true;
        }
        //Check the diagonal (left bottom,right top).
        if (table[2][0].hasMarkO() == value && table[1][1].hasMarkO() == value && table[0][2].hasMarkO() == value) {
            return true;
        }
        //Check the row.
        for (int row = 0; row != table.length; row++) {
            if (table[row][0].hasMarkO() == value && table[row][1].hasMarkO() == value && table[row][2].hasMarkO() == value) {
                return true;
            }
        }
        //Check the column.
        for (int column = 0; column != table.length; column++) {
            if (table[0][column].hasMarkO() == value && table[1][column].hasMarkO() == value && table[2][column].hasMarkO() == value) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGap() {
        boolean value = false;
        //Check other options.
        for (int out = 0; out != table.length; out++) {
            for (int in = 0; in != table.length; in++) {
                if ((table[out][in].hasMarkX() == value) && (table[out][in].hasMarkO() == value)) {
                    return true;
                }
            }
        }
        return false;
    }
}