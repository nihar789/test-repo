package Singelton_DManger;

import java.util.ArrayList;
import java.util.List;

public class DManager {
    private static DManager instance = null;

    private List<String> items;
    private DManager() {
        items = new ArrayList<>();
    }

    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }
    public synchronized void addItem(String item) {
        items.add(item);
    }
    public synchronized void removeItem(String item) {
        items.remove(item);
    }
    public synchronized List<String> getList() {
        return new ArrayList<>(items);
    }
}