import java.util.Scanner;

public class prime_num {
    public static void Check_Prime(int n){  
        int flag = 1;
        for(int i=2;i<=n-1;i++){ 
            if (n%i==0) {
                flag = 0;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not prime number");
        }
        else{
            System.out.println("Prime Number");
        }
    }

    public static void optimize_prime(int n){ 
        int flag = 1;
        for(int i=2;i<=Math.sqrt(n);i++){ 
            if(n%i==0){ 
                flag = 0;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not prime number");
        }
        else{
            System.out.println("Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Check_Prime(n);
        optimize_prime(n);

        sc.close();
    }
}
