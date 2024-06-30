import java.util.*;
public class Main {
    public static int sum =0;
    public static void self(int n){
        if(n ==0){
            System.out.println(sum);
            sum =0;
            return;
        }
        sum += n;
        self(n-1);
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        self(n);


    }
}