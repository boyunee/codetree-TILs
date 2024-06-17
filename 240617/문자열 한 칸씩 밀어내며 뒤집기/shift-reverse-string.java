import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n =sc.nextInt();
        int len = str.length();
        int q =0;
        for(int i =0; i<n;i++){
            q = sc.nextInt();
            switch(q){
                case 1:
                str = str.substring(1,len)+str.substring(0,1);
                break;
                
                case 2:
                str = str.substring(len -1)+str.substring(0,len-1);
                break;
                
                case 3:
                char[] chars = str.toCharArray();
                str ="";

                for(int j =len -1; j>=0; j--){
                    str += String.valueOf(chars[j]);
                }
                break;

                
            }
            System.out.println(str);
        }
    }
}