package Builder_Design_Pattern_Implementation;

// Builder Interface
interface LaptopBuilder {
    LaptopBuilder buildMemory(int memory);
    LaptopBuilder buildStorage(int storage);
    Laptop build();
}
