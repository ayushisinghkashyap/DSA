package practice;

import java.util.Scanner;

public class bitwise_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //and (&) bitwise operator
        System.out.println(a & b);

        //OR (|) bitwise operator
        System.out.println(a | b);

        //Left Shift Operator (<<)
        System.out.println(a << b);

        //Right Shift Operator (>>)
        System.out.println(a >> b);

        //Complement (~)
        System.out.println(~a);
        System.out.println(~b);

        //XOR operator (^)
        System.out.println(a ^ b);

    }
}
