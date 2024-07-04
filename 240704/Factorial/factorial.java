import java.util.*;
public class Main {
    public static int result =1;
    public static int factorial(int n){
        if( n == 0){
            return 1;
        }
        factorial(n-1);
        result *= n;
        return result;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}