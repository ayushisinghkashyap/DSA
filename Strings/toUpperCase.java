package practice;

public class toUpperCase {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");      //using stringbuilder to make code more efficient
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();         //convert stringbuilder to string
    }

    public static void main(String[] args) {
        String str = "hi, how you doing ";
        System.out.println(touppercase(str)); //Hi, How You Doing
    }
}
