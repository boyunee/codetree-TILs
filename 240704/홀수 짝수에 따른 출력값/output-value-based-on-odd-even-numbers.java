import java.util.*;
public class Main {
    public static int result=0;
    public static void sum(int n){
        if(n<=0){
            return;
        }
        result+= n;
        sum(n-2);
        
            


    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        System.out.println(result);

    }
}