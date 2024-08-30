<<<<<<< HEAD
public class func1 {
    public static void noReturn(int n){ 
        System.out.println("No return needed. "+ n);
    }  

    public static int ReturnInteger(int n){
        System.out.println("Integer Return Needed.");
        return n;
    }
    public static String ReturnString(String a){
        System.out.println("String Return Needed");
        return a; //this should be last line in the function 
    }
    // Use any data type you want to return 

    public static void main(String[] args) {
        noReturn(1);
        System.out.println(ReturnInteger(1));
        System.out.println(ReturnString("String"));

        //SOUT is used to print return value
    }
}
=======
Sys,
>>>>>>> 8cb0ed65ae71264e868757d817c95cfb2bf0b97b
