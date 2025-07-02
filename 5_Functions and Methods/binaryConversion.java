import java.util.*;

class binaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary no. and a decimal no. respectively");
        int binNum = sc.nextInt();
        int decNum = sc.nextInt();
        binToDec(binNum);
        decToBin(decNum);
        sc.close();
    }

    public static void binToDec(int binNum) {
        int copy = binNum;
        int pow = 0;
        int lastDigit;
        int dec = 0;
        while (binNum > 0) {
            lastDigit = binNum % 10;
            dec += lastDigit * (int) Math.pow(2, pow++);
            binNum /= 10;
        }
        System.out.println("decimal of " + copy + " is " + dec);
    }

    public static void decToBin(int decNum) {
        int copy = decNum;
        int bin = 0;
        int rem = 0;
        int pow = 0;
        while (decNum > 0) {
            rem = decNum % 2;
            bin += rem * (int) Math.pow(10, pow++);
            decNum /= 2;
        }
        System.out.println("binary of " + copy + " is " + bin);
    }
}
