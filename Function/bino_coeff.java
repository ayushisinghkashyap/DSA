import java.util.Scanner;

public class bino_coeff {
    
    public static int factorial(int f){
        int fact =1;
        if (f==0){
            return 1;
        }

        for(int i=1;i<=f;i++){
            fact=fact*i;
        }
        return f;
    }

    public static void BinomialCoefficient(int n,int r){
        int nn = factorial(n);
        int rr = factorial(r);
        int n_r = factorial(n-r);

        int C = nn/(rr*n_r);
        System.out.println(C);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
  
        BinomialCoefficient(n, r);

        sc.close();
    }
}
