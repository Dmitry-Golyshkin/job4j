package ru.job4j.tracker;

/**
 * @autor Dmitry Golyshkin (mailto: mailerema@gmail.com)
 * @version $Id$
 * @sinse 18.08.18
 */

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Const for Show all items.
     */
    private static final String ShowAll = "1";

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
    private static final String FindByID = "4";

    /**
     * Const for Find item by name.
     */
    private static final String FindByName = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final ConsoleInput input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(ConsoleInput input, Tracker tracker) {
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
            } else if (ShowAll.equals(answer)) {
                this.findAll();
            } else if (Edit.equals(answer)) {
                this.editItem();
            } else if (Delete.equals(answer)) {
                this.deleteItem();
            } else if (FindByID.equals((answer))) {
                this.findItemByID();
            } else if (FindByName.equals(answer)){
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
        Item item = new Item(name, desc,System.currentTimeMillis());
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * The method for Show all Item.
     */
    private void findAll(){
        System.out.println("--------Find All Items--------");
        for (Item items : this.tracker.findall()){
            System.out.println(items.toString());
        }
    }

    /**
     * The method for Edit Item.
     */
    private void editItem(){
        System.out.println("--------Edit Item--------");
        String id = this.input.ask("Enter an Item id to be replaced : ");
        String name = this.input.ask("Enter an Item name : ");
        String desc = this.input.ask("Enter an Item description : ");
        //String id,String name,String description, long create
        Item item = new Item(name, desc,System.currentTimeMillis());

        if (this.tracker.replace(id, item)) {
            System.out.println("The Item was replaced !!!");
        } else {
            System.out.println("The Item wasn't replaced !!!");
        }
    }

    /**
     * The method for delete Item.
     */
    private void deleteItem(){
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
    private void findItemByID(){
        System.out.println("--------Find Item By ID--------");
        String id = this.input.ask("Enter an Item id");
        Item item = this.tracker.findById(id);
        if (item != null){
            System.out.println("The current id was founded by id !!!: " + this.tracker.findById(id).toString());
        } else {
            System.out.println("No Matches");
        }

    }

    /**
     * The method for findItemsByName.
     */
    private void findByName(){
        System.out.println("--------Find Item By Name--------");
        String name = this.input.ask("Enter an Item Name");
        Item[] result = this.tracker.findByName(name);
        for (Item item : result){
            System.out.println("Item" + item.toString());
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
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}