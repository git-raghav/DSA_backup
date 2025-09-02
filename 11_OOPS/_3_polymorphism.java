public class _3_polymorphism {
    public static void main(String[] args) {
        // Calculator c = new Calculator();
        // System.out.println(c.sum(10, 20));
        // System.out.println(c.sum(10.0, 20.0));
        // System.out.println(c.sum(10, 20, 30));

        // Animal a = new Animal();
        // a.eat();
        // Deer d = new Deer();
        // d.eat();

        // upcasting
        Animal a1 = new Deer(); //a1 is a reference variable of Animal class and it is pointing to object of Deer class (it has address of object of Deer class)
        a1.eat();
        System.out.println(a1);

        // Deer d1 = new Animal(); //error
        // d1.eat();
    }
}

// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class Animal {
    void eat() {
        System.out.println("Eating anything");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Eating grass");
    }
}
