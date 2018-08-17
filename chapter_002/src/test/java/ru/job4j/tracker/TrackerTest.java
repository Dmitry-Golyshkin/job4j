package ru.job4j.tracker;



import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 456L);
        tracker.add(item);
        assertThat(tracker.findall()[0], is(item));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 456L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 4569L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteItemFromTracker() {
        Tracker tracker = new Tracker();
        Item items = new Item("test4", "testDescription2", 999L);
        tracker.add(new Item("test1", "testDescription", 888L));
        tracker.add(new Item("test2", "testDescription2", 7777L));
        tracker.add(new Item("test2", "testDescription2", 6666L));
        tracker.add(items);
        tracker.delete(items.getId());
        assertThat(tracker.findall().length, is(3));
    }
    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        int count = 0;
        tracker.add(new Item("test4", "testDescription2", 121L));
        tracker.add(new Item("test1", "testDescription", 987L));
        tracker.add(new Item("test2", "testDescription2", 6542L));
        tracker.add(new Item("test2", "testDescription2", 6543L));
        tracker.add(new Item("test2", "testDescription2", 6544L));
        for (Item items : tracker.findByName("test2")) {
            if (items != null) count++;
        }
        assertThat(count,is(3));
    }
    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item items = new Item("test1", "testDescription", 321L);
        tracker.add(new Item("test2", "testDescription2", 4321L));
        tracker.add(new Item("test2", "testDescription2", 4321L));
        tracker.add(items);
        assertThat(tracker.findById(items.getId()).getName(), is("test1"));
    }
    @Test
    public void whenFindAllItems() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test4", "testDescription2", 232L));
        tracker.add(new Item("test1", "testDescription", 123L));
        tracker.add(new Item("test2", "testDescription2", 1234L));
        tracker.add(new Item("test2", "testDescription2", 1232L));
        assertThat(tracker.findall().length, is(4));
    }


}
