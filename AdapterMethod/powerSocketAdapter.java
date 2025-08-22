package AdapterMethod;

// Adapter class
class powerSocketAdapter implements IChargerAdaptee {
    ChargerAdaptee cAdpteObj;

    powerSocketAdapter() {
        cAdpteObj = new ChargerAdaptee();
    }

    @Override
    public void charge() {
        cAdpteObj.charge();
    }

    public void removeCharge() {
        cAdpteObj.removeCharge();
    }
}

