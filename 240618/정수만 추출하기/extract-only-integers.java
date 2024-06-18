import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(transe(a) + transe(b));
        
    }
    public static int transe(String str){
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) <'0' || str.charAt(i) > '9'){
                str = str.substring(0, i);
                break;
            }
        }
        // System.out.println(str);
        return Integer.parseInt(str);
        // return 1;
    }
}