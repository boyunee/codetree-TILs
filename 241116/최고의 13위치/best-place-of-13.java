import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ints[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                max = Math.max(max, ints[i][j]+ ints[i][j+1] + ints[i][j+2]);
            }
        }

        System.out.println(max);
    }
}