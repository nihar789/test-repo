package Builder_Design_Pattern_Implementation;// Product

class Laptop {
    private int memory;
    private int storage;

    public Laptop(int memory, int storage) {
        this.memory = memory;
        this.storage = storage;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Builder_Design_Pattern_Implementation.Laptop{" +
                "memory=" + memory +
                ", storage=" + storage +
                '}';
    }
}
