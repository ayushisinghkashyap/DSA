import java.util.Scanner;

public class range_prime {
    public static void Check_Prime(int n){  
        int flag = 1;
        for(int i=2;i<=n-1;i++){ 
            if (n%i==0) {
                flag = 0;
                break;
            }
        }
        if(flag==1){
            System.out.println(n);
        }
    }

    public static void range_Prime(int n){
        for(int i=1;i<=n;i++){
            Check_Prime(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime Numbers");
        range_Prime(n);

        sc.close();
    }

}
