interface SwitchOnOff {
    void turnOn();
    void turnOff();
}

class LightBul implements SwitchOnOff {
    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}

class Switch {
    SwitchOnOff device;

    Switch(SwitchOnOff device) {
        this.device = device;
    }

    void operate() {
        device.turnOn();
    }
}

public class Day21_Task9 {
    public static void main(String[] args) {
        SwitchOnOff lbulbobj = new LightBul();
        Switch lightswitch = new Switch(lbulbobj);
        lightswitch.operate();
    }
}
