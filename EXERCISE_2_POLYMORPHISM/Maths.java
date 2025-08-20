// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    double area() {
        return 0;
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    double area() {
        return length * width;
    }
}

// Main class
public class Maths {
    public static void main(String[] args) {
        // Polymorphic references
        Shape s1 = new Circle(5);   // Parent reference, Circle object
        Shape s2 = new Rectangle(4, 6); // Parent reference, Rectangle object

        // Same method calls behave differently depending on object type
        s1.draw();
        System.out.println("Circle Area: " + s1.area());

        s2.draw();
        System.out.println("Rectangle Area: " + s2.area());
    }
}
