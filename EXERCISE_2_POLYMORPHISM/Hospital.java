class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Doctor extends Employee {
    @Override
    void work() {
        System.out.println("Doctor is treating patients");
    }
}

class Nurse extends Employee {
    @Override
    void work() {
        System.out.println("Nurse is assisting doctors");
    }
}

public class Hospital {
    public static void main(String[] args) {
        Employee e1 = new Doctor();
        Employee e2 = new Nurse();
        Employee e3 = new Employee();

        e1.work();
        e2.work();
        e3.work();
    }
}
