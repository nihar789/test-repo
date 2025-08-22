package AdapterMethod;

// Client class
class DellLaptop implements ILaptopTarget {
    IChargerAdaptee chargerObj;

    DellLaptop(IChargerAdaptee chargerObj) {
        this.chargerObj = chargerObj;
    }

    @Override
    public void charge() {
        chargerObj.charge();
    }

    @Override
    public void removeCharge() {
        chargerObj.removeCharge();
    }
}

