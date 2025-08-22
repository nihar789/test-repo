package Builder_Design_Pattern_Implementation;

// Concrete Builder
class LaptopConcreteBuilder implements LaptopBuilder {
    private int memory;
    private int storage;

    @Override
    public LaptopBuilder buildMemory(int memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public LaptopBuilder buildStorage(int storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Laptop build() {
        return new Laptop(memory, storage);
    }
}
