import java.util.*;
public class Main {
    public static int[] ints = new int[20];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(toBinary(toDecimal(n) * 17));

    }
    static int toDecimal(int n){
        String str = String.valueOf(n);
        int count =0;
        int result =0;

        for(int i= str.length() -1; i>=0 ;i--){
            result += Math.pow(2, count++) * (str.charAt(i) - 48);
            // System.out.println(str.charAt(i) - 48);
        }
        // System.out.println(result);
        return result;
    }
    static String toBinary(int n){
        String str ="";
        int cnt=0;
        while(true){
        if(n<2){
            ints[cnt++] = n;
            for(int i=cnt -1 ; i>=0 ; i--){
                str += String.valueOf(ints[i]);
                
            }
            return str;
        }
        ints[cnt++] = n % 2;
        n/=2;
        }
    }
}