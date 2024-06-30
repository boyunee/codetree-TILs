import java.util.*;
public class Main {
    public static int n;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        self(n);

    }
    public static void self(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        self(n -1);
        System.out.print(n+" ");

        

    }
}