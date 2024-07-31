import java.util.*;
public class Main {
    public static String str;
    public static int sum = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a * b * c;
        str = String.valueOf(mul);
        int len = str.length();
        System.out.println(findSum(len-1));
    }
    public static int findSum(int n){
        if(n==0){
            return Integer.parseInt(String.valueOf(str.charAt(0)));
        }
        return findSum(n-1)+Integer.parseInt(String.valueOf(str.charAt(n)));
        

    }
}