import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        int len = str.length();
        for(int i=1; i<=len; i++){
            if(i==len){
                System.out.println(str.substring(len - i));
                break;
            }
            System.out.println(str.substring(len - i)+str.substring(0, len-i));
            // System.out.println(str.substring()+str.substring())
            
        }
    }
}