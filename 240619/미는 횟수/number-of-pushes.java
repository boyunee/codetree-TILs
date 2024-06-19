import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        StringBuilder sb = new StringBuilder(str1);
        int count =0;
        while(!str1.equals(str2)){
            sb.insert(0, sb.charAt(str1.length() - 1));
            sb.deleteCharAt(str1.length());
            str1 = sb.toString();
            count++;
            // System.out.println(str1);
            if(count >= str1.length()){
                System.out.println(-1);
                break;
            }


        }
        if(count < str1.length()){

        
        System.out.println(count);}

    }
}