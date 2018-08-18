package ru.job4j.tracker;

/**
 * @autor Dmitry Golyshkin (mailto: mailerema@gmail.com)
 * @version $Id$
 * @sinse 18.08.18
 */

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
