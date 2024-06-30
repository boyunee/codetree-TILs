import java.util.*;
public class Main {
    public static int count =0;
    public static void F(int n){
        if(n==1){
            System.out.println(count);
            count =0;
            return;
        }
        if( n% 2 == 0){
            count++;
            F(n / 2);
        }else{
            count++;
            F(n / 3);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        F(n);

    }
}