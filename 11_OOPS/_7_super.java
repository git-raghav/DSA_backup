public class _7_super {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.color);
    }
}

class Animal {
    String color;
}

class Dog extends Animal {
    Dog() {
        super.color = "White";
    }
}
