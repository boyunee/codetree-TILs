import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n =sc.nextInt();
        int len = str.length();
        StringBuilder sb = new StringBuilder(str);
        int q =0;
        for(int i =0; i<n;i++){
            q = sc.nextInt();
            switch(q){
                case 1:
                sb.deleteCharAt(0);
                sb.append(String.valueOf(str.charAt(0)));
                break;
                
                case 2:
                sb.deleteCharAt(len-1);
                sb.insert(0,String.valueOf(str.charAt(len-1)));
                break;
                
                case 3:
                sb.reverse();
                break;

                
            }
            str = sb.toString();
            System.out.println(str);
        }
    }
}