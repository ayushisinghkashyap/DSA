package practice;

import java.util.Scanner;

public class odd_evenCheck {
    public static void Checkbit(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Checkbit(n);
    }
}
