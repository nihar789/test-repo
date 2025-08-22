package AdapterMethod;

// Adaptee class
class ChargerAdaptee implements IChargerAdaptee {
    public void charge() {
        System.out.println("Charging my laptop");
    }

    public void removeCharge() {
        System.out.println("Not charging my laptop");
    }
}
