package ru.job4j.pseudo;
/**
 * @author Dmitry Golyshkin (dmgoly@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("   +   ");
        builder.append("  + +  ");
        builder.append(" +   + ");
        builder.append("+++++++");
        return builder.toString();
    }
}
