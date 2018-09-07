package ru.job4j.SmartProgress.guess;

/**
 * @autor Dmitry Golyshkin (mailto: mailerema@gmail.com)
 * @version $V_01$
 * @sinse 08.09.18
 */

import java.util.Scanner;
import java.lang.Math;

public class GuessANumber {
    public static void main(String[] args) {

        int UnknownNumber, Player1, Player2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Name first Player");
        String name1 = input.nextLine();
        System.out.println("Input Name second Player");
        String name2 = input.nextLine();


        System.out.println("Guess A Number ( 0 to 1000)");

        UnknownNumber = (int)Math.floor(Math.random() * 1000);

        do {

            System.out.print(name1 + " Input your number: ");
            Player1 = input.nextInt();

            System.out.print(name2 + " Input your number: ");
            Player2 = input.nextInt();

            if (Player1 > UnknownNumber)
                System.out.println(name1 + " Number is less ");
            if (Player2 > UnknownNumber)
                System.out.println(name2 + " Number is less ");

            if (Player1 < UnknownNumber)
                System.out.println(name1 + " Number more ");
            if (Player2 < UnknownNumber)
                System.out.println(name2 + " Number more");

            if (Player1 == UnknownNumber)
                System.out.println(name1 + " You won!");
            if (Player2 == UnknownNumber)
                System.out.println(name2 + " You won!");

        } while (Player1 != UnknownNumber & Player2 != UnknownNumber );


    }
}
