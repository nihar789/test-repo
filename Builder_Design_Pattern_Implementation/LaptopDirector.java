package Builder_Design_Pattern_Implementation;

// Director (optional)
class LaptopDirector {
    private LaptopBuilder laptopBuilder;

    public LaptopDirector(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop constructLaptop(int memory, int storage) {
        return laptopBuilder.buildMemory(memory)
                .buildStorage(storage)
                .build();
    }
}
