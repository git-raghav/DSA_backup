public class _1_classesObject {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // object creation, Pen type ka hoga p1 and Pen() is a constructor
        p1.color = "blue";
        p1.tip = 5;
        // System.out.println(p1.color + " " + p1.tip);
        p1.setColor("red");
        p1.setTip(10);
        // System.out.println(p1.color + " " + p1.tip);

        //access modifier
        BankAccount acc = new BankAccount();
        acc.name = "abc";
        acc.setPassword("1234");
        //System.out.println(acc.name); //will work
        //System.out.println(acc.password); //will not work as password is private and we are trying to access it from another class
    }
}

class BankAccount {
    public String name;
    private String password; // private means it can't be accessed outside this class
    public void setPassword(String newPassword) {
        password = newPassword;
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
    float percentage;

    void calc(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
