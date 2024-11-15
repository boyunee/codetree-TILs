import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();

        int max = 0;
        boolean isZero = false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                isZero = true;
                int dec = toDecimal(str.substring(0,i)+"1"+str.substring(i+1));
                // System.out.println(dec);
                max = Math.max(max, dec);
            }
        }

        if(!isZero){
            int dec = toDecimal(str.substring(0,str.length()-1)+"0");
            max = Math.max(max, dec);
        }
        System.out.println(max);


    }
    static int toDecimal(String str){
        int num = Integer.valueOf(str);
        // System.out.println(num);
        int result = 0;
        int t = 1;
        while(num > 0){
            result += (num % 10) * t;
            t *=2;
            num /= 10;
        }
        // System.out.println(result);
        return result;
    }
}