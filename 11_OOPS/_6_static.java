public class _6_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raghav";
        s1.roll = 10;
        s1.college = "ABC College";
        s1.display();

        Student s2 = new Student(); //college is static so for every object its value will be same, if i change it in one object it will reflect in all
        s2.name = "Rahul";
        s2.roll = 20;
        s2.display();
    }
}

class Student {
    String name;
    int roll;
    static String college;

    void display() {
        System.out.println(name + " " + roll + " " + college);
    }
}
