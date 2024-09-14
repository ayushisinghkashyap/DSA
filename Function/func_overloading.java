public class func_overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(float a, float b){
        float s= a+b;
        int ss = (int) s;
        return ss;
    }

    //return type must be same for function overloading

    public static void main(String[] args) {

        System.out.println(sum(7,6 ));
        System.out.println(sum(7, 6, 4));
        System.out.println(sum(2, 3.8f));

    }
}
