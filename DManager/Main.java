package DManager;

public class Main {
    public static void main(String[] args) {
        DManager manager = DManager.getInstance();
        manager.addItem("Item 1");
        manager.addItem("Item 2");
        System.out.println(manager.list()); // [Item 1, Item 2]
        manager.removeItem("Item 1");
        System.out.println(manager.list()); // [Item 2]
    }
}