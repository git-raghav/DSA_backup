public class _4_abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); //error
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "White";
    }

    void eat() {
        System.err.println("Eating");
    }

    abstract void walk(); // abstract method (it just gives idea and doesnt have any implementation, it says this method should exist in the childern classes)
}

class Horse extends Animal {
    void changeColor() {
        color = "brown";
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walking on 2 legs");
    }
}
