
abstract class Appliance {
    abstract void turnOn();   // abstract method
    abstract void turnOff();  // abstract method

    void showStatus(String applianceName, boolean isOn) {
        System.out.println(applianceName + " is " + (isOn ? "ON" : "OFF"));
    }
}

class Fan extends Appliance {
    private boolean isOn = false;

    void turnOn() {
        isOn = true;
        showStatus("Fan", isOn);
    }

    void turnOff() {
        isOn = false;
        showStatus("Fan", isOn);
    }
}

class Light extends Appliance {
    private boolean isOn = false;

    void turnOn() {
        isOn = true;
        showStatus("Light", isOn);
    }

    void turnOff() {
        isOn = false;
        showStatus("Light", isOn);
    }
}

public class ApplianceApp {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance light = new Light();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
    }
}
