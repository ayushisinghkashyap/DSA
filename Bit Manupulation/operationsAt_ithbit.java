package practice;

import java.util.Scanner;

public class operationsAt_ithBit {
    public static int getIthBit(int a, int i) {   // a = 10 , i = 2
        int bitmask = 1;                      // bitmask << 2 = 0100
        if ((a & (bitmask << i)) == 0) {  // 1010 & 0100 = 0000
            return 0;                     // return 0
        } else {
            return 1;
        }
    }

    public static int setIthBit(int a, int i) {   // a = 10 , i = 2
        int bitmask = 1;   // bitmask << i = 0100 ,  1010
        return (a | (bitmask << i));            // | 0100
                                                //   1110 = 14
    }
    public static int clearIthBit(int a , int i){  // a = 10 , i = 2
        int bitmask =1;   //~(bitmask << i) = 1011 , 1010
        return a & (~(bitmask<<i));            //  & 1011
                                               //    1010 = 10
    }
    public static int updateIthbit(int a , int i , int newbit){ //(10,2,1)
        if (newbit == 0){   //!=0 ,
            return clearIthBit(a,i);
        }else{             // ==1     1010
            return setIthBit(a,i);  //0100
        }                           //1110 =14
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        int newbit = sc.nextInt();
        System.out.println(getIthBit(a,i));
        System.out.println(setIthBit(a,i));
        System.out.println(clearIthBit(a,i));
        System.out.println(updateIthbit(a,i,newbit));


    }
}
