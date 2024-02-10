public class arr {
    public static void update(int marks[] ,int  nonchangeable){
        for (int i =0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        nonchangeable =10;
    }
    public static void main(String args[]){
        int marks[]={97,98,98};
        int nonchangeable=5;
        update(marks, nonchangeable);

        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println(nonchangeable);

    }
}
