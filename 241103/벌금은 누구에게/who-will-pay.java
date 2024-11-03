import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] students = new int[n];
        
        problem(n, m, k, students, sc);
    }
    static void problem(int n, int m, int k, int[] students, Scanner sc){
        int num =0;
        for(int i =0; i<m; i++){
            num  = sc.nextInt();
            students[num - 1] += 1;
            if(students[num-1] >= k){
                System.out.println(num);
                return;
            }
        }
        System.out.println(-1);
        
    }
}