import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));


    }
    public static int solution(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        return solution(n/3) + solution(n-1);

    }
    
}