package PrototypeDesignPattern;

class WhiteConcretePrototype implements Colors {
    private String name;

    public WhiteConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Colors clone() {
        return new WhiteConcretePrototype(this.name);
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
