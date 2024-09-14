import java.util.Scanner;

public class swap {
    public static void swapnum(int a, int b){
        int temp =a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {

        //Actual Value
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("After Swapping");
        swapnum(a, b);  // numbers will swap 

        // even after swapping when we print the values this the actual valua
        // called call by value (JAVA always call by value)
        // where the copy of actual value passes to the function .

        System.out.println("Before swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        sc.close();
    }
}
