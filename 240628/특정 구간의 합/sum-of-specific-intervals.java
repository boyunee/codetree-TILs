import java.util.*;
public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            intsSum(sc.nextInt(), sc.nextInt());

        }
    }
    public static void intsSum(int a1, int a2){
        int sum = 0; 
        for(int i =a1 - 1; i<= a2 -1; i++){
            sum += ints[i];

        }
        System.out.println(sum);
    }
}