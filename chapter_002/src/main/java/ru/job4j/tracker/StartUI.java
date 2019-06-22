package ru.job4j.tracker;

/**
 * @version $Id$
 * @autor Dmitry Golyshkin (mailto: mailerema@gmail.com)
 * @sinse 05.10.18
 */

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Const for Show all items.
     */
    private static final String Show_All = "1";

    /**
     * Const for Edit item.
     */
    private static final String Edit = "2";

    /**
     * Const for delete items;
     */
    private static final String Delete = "3";

    /**
     * Const for Find item by id.
     */
    private static final String Find_By_ID = "4";

    /**
     * Const for Find item by name.
     */
    private static final String Find_By_Name = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (Show_All.equals(answer)) {
                this.findAll();
            } else if (Edit.equals(answer)) {
                this.editItem();
            } else if (Delete.equals(answer)) {
                this.deleteItem();
            } else if (Find_By_ID.equals((answer))) {
                this.findItemByID();
            } else if (Find_By_Name.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");

        //String id,String name,String description, long create
        Item item = new Item(name, desc, System.currentTimeMillis());
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * The method for Show all Item.
     */
    private void findAll() {
        Item[] items = tracker.findall();
        if (items.length != 0) {
            System.out.println("-------------Items:------------");
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("***********No Items***********");
        }

    }

    /**
     * The method for Edit Item.
     */
    private void editItem() {
        System.out.println("--------Edit Item--------");
        String id = this.input.ask("Enter an Item id to be replaced : ");
        Item item = tracker.findById(id);
        System.out.println("Edit item ID" + id);
        String name = this.input.ask("Enter an Item new name : ");
        String desc = this.input.ask("Enter an Item new description : ");
        item.setName(name);
        item.setDescription(desc);
        System.out.println("----------Item ID" + item.getId() + "updated successfully");

    }

    /**
     * The method for delete Item.
     */
    private void deleteItem() {
        System.out.println("--------Delete--------");
        String id = this.input.ask("Enter an Item id to be deleted : ");
        if (this.tracker.delete(id)) {
            System.out.println("The item deleted");
        } else {
            System.out.println("The item wasn't found");
        }
    }

    /**
     * The method for findItemByID.
     */
    private void findItemByID() {

        String id = this.input.ask("-----------Input ID : ----------");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item ID " + item.getId() + " Found.\n"
                    + "Name Item: " + item.getName()
                    + "\nDescription : " + item.getDescription());
        } else {
            System.out.println("***********Task ID " + id + " not found.***********");
        }

    }

    /**
     * The method for findItemsByName.
     */
    private void findByName() {
        String key = this.input.ask("***********Input Name item: ***********");
        Item[] items = tracker.findByName(key);
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("----------Name Items  " + key + " not found---------");
        }

    }


    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0.ADD new Item.");
        System.out.println("1.Show all Item.");
        System.out.println("2.Edit Item.");
        System.out.println("3.Delete item.");
        System.out.println("4.Find Item by Id.");
        System.out.println("5.Find Item by Name.");
        System.out.println("6.Exit.");
        System.out.println();

    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}