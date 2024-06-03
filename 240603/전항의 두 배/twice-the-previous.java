import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int pp = sc.nextInt();
        int p = sc.nextInt();
        System.out.print(pp+" "+p+" ");

        int result = 0;
        for(int i = 0; i<8; i++){
            result = p+ pp*2;
            pp = p;
            p = result;
            System.out.print(result+" ");

        }
    }
}