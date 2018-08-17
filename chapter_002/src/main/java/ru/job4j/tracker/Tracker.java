package ru.job4j.tracker;

/**
 * Class Tracker.
 *
 * @author @author Dmitry Golyshkin (mailerema@gmail.com)
 * @version $Id$
 * @since 17.08.2018
 */

import java.util.*;

public class Tracker {
    /**
     * Array for save task.
     */
    private final Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();


    /**
     * The method for add task.
     * @param item
     * @return item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * The method generate items.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * The Method delete items.
     * @param id of the item
     */
    public void delete(String id){
        for(int i = 0; i < position; i++){
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1 - i);
                items[position--] = null;
            }
        }
    }

    /**
     * The method replace items.
     * @param id of item
     */
    public void replace(String id, Item item) {
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                item.setId(id);
                this.items[i] = item;
                break;
            }
        }
    }
    /**
     * The method get all items.
     *
     * @return list of items.
     */
    public Item[] findall() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * The method of obtaining a list by name.
     * @param key name
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (Item item : this.items) {
            if(item != null && item.getName().equals(key)) {
                result[count] = item;
                count++;
            }
        }
        return result;
    }
    /**
     * The method get item by id.
     * @param id item id.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if(item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

}
