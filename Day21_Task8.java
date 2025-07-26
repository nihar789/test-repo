class LightBulb {
    void turnOn() {
        System.out.println("Light turned on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

class Day21_Task8 { //switch
    LightBulb lbulbobj;

    Day21_Task8(LightBulb lbulbobj) {
        this.lbulbobj = lbulbobj;
    }

    void operate() {
        lbulbobj.turnOn();
    }

    public static void main(String[] args) {
        LightBulb lbulbobj = new LightBulb();
        Day21_Task8 Switchobj = new Day21_Task8(lbulbobj);
        Switchobj.operate();
    }
}
