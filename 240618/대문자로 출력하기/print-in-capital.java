import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String result ="";
        for(int i=0; i<str.length();i++){
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
                result += String.valueOf(sb.charAt(i)).toUpperCase();

            }else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
                result += sb.charAt(i);

            }else{
                continue;
            }
        }
        System.out.println(result);
    }
}