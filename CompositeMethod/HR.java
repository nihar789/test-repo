package CompositeMethod;

// Leaf component
class HR implements Company {
    private int id;
    private String name;

    public HR(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayName() {
        System.out.println("Department: " + name);
    }
}

