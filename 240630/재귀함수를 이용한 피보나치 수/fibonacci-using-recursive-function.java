import java.util.*;
public class Main {
    public static int PBNCH(int n){
        if(n==1){
            return 1;
        }
        if(n ==2){
            return 1;

        }
        return PBNCH(n-1) + PBNCH(n -2);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(PBNCH(n));



    }
}