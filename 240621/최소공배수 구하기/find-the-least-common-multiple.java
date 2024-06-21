import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n*m; i++){
            if(i % n ==0 && i % m == 0){
                System.out.println(i);
                break;
            }
        }
    }
}