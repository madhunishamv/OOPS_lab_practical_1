class Staff {
    String name;
    Staff(String name) {
        this.name = name;
    }
    void work() {
        System.out.println(name + " is working in the hospital.");
    }
}

class Doctor extends Staff {
    Doctor(String name) {
        super(name);
    }
    void diagnose() {
        System.out.println(name + " is diagnosing patients.");
    }
}

class Nurse extends Staff {
    Nurse(String name) {
        super(name);
    }
    void assist() {
        System.out.println(name + " is assisting doctors.");
    }
}

class Receptionist extends Staff {
    Receptionist(String name) {
        super(name);
    }
    void register() {
        System.out.println(name + " is registering patients.");
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Kumar");
        Nurse n = new Nurse("Madhunisha");
        Receptionist r = new Receptionist("Anitha");

        d.work();
        d.diagnose();

        n.work();
        n.assist();

        r.work();
        r.register();
    }
}
