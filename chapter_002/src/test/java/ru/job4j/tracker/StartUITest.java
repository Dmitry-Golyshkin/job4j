package ru.job4j.tracker;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitry Golyshkin (dmgoly@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class StartUITest {
    Tracker tracker = new Tracker();     // создаём Tracker
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

    private String menu = "Меню.\n" +
            "0.ADD new Item.\n" +
            "1.Show all Item.\n" +
            "2.Edit Item.\n" +
            "3.Delete item.\n" +
            "4.Find Item by Id.\n" +
            "5.Find Item by Name.\n" +
            "6.Exit.";

    @Test
    public void whenFindById(){
        Item item = tracker.add(new Item("test","desc"));
        Input input = new StubInput(new String[]{"4", item.getId(),"6"});
        new StartUI(input,tracker).init();
        assertThat(
                this.out.toString(),
                is(new StringBuilder().
                        append(menu + "\n\n" +
                                "Item ID " + item.getId() + " Found.\n" +
                                "Name Item: " + item.getName() +"\n" +
                                "Description : " + item.getDescription() + "\n" +
                                menu + "\n"
                        ).
                        append(System.lineSeparator()).
                        toString()));

    }


    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findall()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerDeleteValue() {
        Item item = tracker.add(new Item("test","desc"));
        Item item1 = tracker.add(new Item("test2","desc"));
        Input input = new StubInput(new String[]{"3",item.getId(),"6"});
        new StartUI(input,tracker).init();
        assertThat(tracker.findById(item1.getId()).getName(),is("test2"));
    }

}
