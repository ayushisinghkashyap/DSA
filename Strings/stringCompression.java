package practice;

public class stringCompression {
    public static String stringcompression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            char ch = str.charAt(i);
            while(i<str.length()-1 && ch==str.charAt(i+1)) {
                count += 1;
                str.charAt(i++);
            }
            sb.append(ch);
            sb.append(count);

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbbcccdd";
        System.out.println(stringcompression(str));
    }
}
