import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pp = 1;
        int p = num;
        System.out.print(pp +" "+p+" ");
        int result = 0;
        while(result < 100){
            result = pp + p;
            pp = p;
            p = result;
            System.out.print(result + " ");
        }
    }
}