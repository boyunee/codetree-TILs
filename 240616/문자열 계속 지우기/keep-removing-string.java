import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        while(A.indexOf(B) != -1){
            A = A.replace(B,"");

        }
        System.out.println(A);
    }
}