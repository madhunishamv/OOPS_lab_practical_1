class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog
    }
}
