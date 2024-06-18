import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sb_a = new StringBuilder(a);
        StringBuilder sb_b = new StringBuilder(b);

        System.out.println(transe(sb_a) + transe(sb_b));
        
    }
    public static int transe(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) <'0' || sb.charAt(i) > '9'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        String result = sb.toString();
        // System.out.println(result);
        return Integer.parseInt(result);
        // return 1;
    }
}