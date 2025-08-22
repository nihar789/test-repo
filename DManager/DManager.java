package DManager;

import java.util.ArrayList;
import java.util.List;

public class DManager {
    // Private static variable to hold the singleton instance
    private static DManager instance;

    // Private variable to hold the list
    private List<String> itemList;

    // Private constructor to prevent direct instantiation
    private DManager() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created. Use getInstance() method.");
        }
        itemList = new ArrayList<>();
    }

    // Public static synchronized method to get the singleton instance
    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    // Public synchronized method to add an item to the list
    public synchronized void addItem(String item) {
        itemList.add(item);
    }

    // Public synchronized method to remove an item from the list
    public synchronized void removeItem(String item) {
        itemList.remove(item);
    }

    // Public synchronized method to retrieve the list
    public synchronized List<String> list() {
        return new ArrayList<>(itemList); // Return a copy to prevent external modifications
    }
}
