package ru.job4j.fit;
/**
 * Fit.(This programm for calculate ideal weight).
 *
 * @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 14.05.2018
 */

public class Fit {
    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return ((height - 110) * 1.15);
    }
}