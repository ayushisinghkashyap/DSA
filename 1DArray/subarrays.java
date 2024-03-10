/**
 * subarrays
 */
public class subarrays {
    public static void printSubarray(int numbers[]){
        //int totalSum=0;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for (int j=0;j<i+1;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.println(numbers[k]+"  ");
                }
               // totalSum++;
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        printSubarray(numbers);
    }
}