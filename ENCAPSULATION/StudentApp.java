class Student {
    private String name;
    private int age;
    private double gpa;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid age!");
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10)
            this.gpa = gpa;
        else
            System.out.println("Invalid GPA!");
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
}

public class StudentApp {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Riya");
        s.setAge(20);
        s.setGpa(8.9);

        s.setName("Manisha");
        s.setAge(21);
        s.setGpa(8.4);
        System.out.println("Student: " + s.getName() + ", Age: " + s.getAge() + ", GPA: " + s.getGpa());
    }
}
