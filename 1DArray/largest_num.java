public class larNum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-INFINITY
        int smallest = Integer.MAX_VALUE;//+INFINITY
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];
            }
            if (smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[]={3,7,9,5,60};
        System.out.println("Largest :"+getLargest(nums));;

    }
}
