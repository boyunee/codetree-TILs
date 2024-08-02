import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(output(n));

    }
    public static int output(int n){
        if(n==1){
            return 2;
        }else if(n==2){
            return 4;
        }
        return (output(n-2) * output(n-1))%100;

    }
}