public class pairsArray {
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j =0;j<i;j++){
                System.out.println("("+curr+","+numbers[j]+")");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10,12,14,16};
        printPairs(numbers);
        
    }
}
