import java.util.*;
public class Main {
    public static int a,b,n;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();

        toB(toDecimal());

    }
    static int toDecimal(){
        String str = String.valueOf(n);
        int result =0;
        int count =0;

        for(int i=str.length() - 1; i>=0; i--){
            result += Math.pow(a, count++) * (str.charAt(i) - 48);
        }
        return result;
    }
    static void toB(int n){
        int[] ints = new int[20];
        int count =0;
        while(true){
            if(n<b){
                ints[count++] = n;
                for(int i=count -1; i>=0; i--){
                    System.out.print(ints[i]);
                }
                return;
            }
            ints[count++] = n % b;
            n /= b;
        }
    }
}