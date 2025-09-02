public class _2_inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        a.eat();
        m.eat();
        m.legs();
        d.eat();
        d.legs();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.legs();
        c.meow();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

// single level or simple inheritance
class Mammal extends Animal {
    void legs() {
        System.out.println("has Legs");
    }
}

// multi level inheritance
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking");
    }
}

// hierarchical inheritance
class Cat extends Mammal {
    void meow() {
        System.out.println("Meowing");
    }
}
