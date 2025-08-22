package PrototypeDesignPattern;

// Concrete prototype
class BlackConcretePrototype implements Colors {
    private String name;

    public BlackConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Colors clone() {
        return new BlackConcretePrototype(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
