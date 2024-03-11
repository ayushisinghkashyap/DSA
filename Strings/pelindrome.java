package practice;

import java.util.Scanner;

public class pelindrome {
    public static boolean ispelindrome(String str){
        int n=str.length();
        for(int i =0; i<n/2;i++){
            //pelindrome String Condition
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ispelindrome(str));
    }
}
