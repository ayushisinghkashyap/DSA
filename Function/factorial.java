import java.util.Scanner;

public class factorial {

    public static int fact(int n){
        int f =1;

        if (n<0){
            System.out.print("Not a valid number -> ");
            return -1;
        }
        if (n==0){
            return 1;
        }

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Factorial of "+n+" is "+fact(n));

        sc.close();
    }
}
