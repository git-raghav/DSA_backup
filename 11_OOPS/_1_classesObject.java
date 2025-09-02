public class _1_classesObject {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // object creation, Pen type ka hoga p1 and Pen() is a
        // constructor
        // p1.color = "blue";
        // p1.tip = 5;
        // System.out.println(p1.color + " " + p1.tip);
        // p1.setColor("red");
        // p1.setTip(10);
        // System.out.println(p1.color + " " + p1.tip);

        // access modifier
        // BankAccount acc = new BankAccount();
        // acc.name = "abc";
        // acc.setPassword("1234");
        // System.out.println(acc.getPassword());
        // System.out.println(acc.name); //will work
        // System.out.println(acc.password); //will not work as password is private and
        // we are trying to access it from another class

        // constructor and constructor overloading
        Student s1 = new Student();
        Student s2 = new Student("raghav");
        Student s3 = new Student(20);
        // System.out.println(s2.name);
        // System.out.println(s3.age);
        s3.name = "xyz";
        s3.password = "1234";
        s3.marks[0] = 80;

        // copy constructor
        Student s4 = new Student(s3);
        System.out.println(s4.name + " " + s4.age);
        s4.password = "4321";
        System.out.println(s4.password);
        s4.marks[0] = 90;
        System.out.println(s3.marks[0]); // this should be 80 but its 90 as array is passed by reference
        System.out.println(s4.marks[0]);
    }
}

class BankAccount {
    public String name;
    private String password; // private means it can't be accessed outside this class

    // getters and setters
    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public String getPassword() {
        return this.password;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    // constructor overloading (type of polymorphism)
    Student() { // non-parameterized constructor
        System.out.println("constructor called");
    }

    Student(String name) { // parameterized constructor
        this.name = name;
    }

    Student(int age) {
        marks = new int[3];
        this.age = age;
    }

    // shallow copy constructor
    // Student(Student s) {
    // marks = new int[3];
    // this.name = s.name;
    // this.age = s.age;
    // this.marks = s.marks;
    // }

    // deep copy constructor
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.age = s.age;
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}
