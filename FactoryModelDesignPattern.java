// Product Interface
interface Pizza {
    void preparation();
    void baking();
    void cutting();
    void boxing();
}

// Concrete Product
class PepperoniPizza implements Pizza {
    @Override
    public void preparation() {
        System.out.println("Preparing Pepperoni Pizza");
    }

    @Override
    public void baking() {
        System.out.println("Baking Pepperoni Pizza");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting Pepperoni Pizza");
    }

    @Override
    public void boxing() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}

// Creator Interface
interface PizzaFactory {
    Pizza createPizza();
}

// Concrete Creator
class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

// Driver Class
public class FactoryModelDesignPattern {
    public static void main(String[] args) {
        PizzaFactory pfobj = new PepperoniPizzaFactory();
        Pizza pobj = pfobj.createPizza();

        pobj.preparation();
        pobj.baking();
        pobj.cutting();
        pobj.boxing();
    }
}
