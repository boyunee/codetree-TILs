
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
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
                int sum = ints[i][j] + ints[i][j+1] + ints[i][j+2];
                max = Math.max(max, sum);
            }
        }

        // System.out.println(max);


        
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                int sum = ints[i][j] + ints[i][j+1] + ints[i][j+2];
                if(sum == max){
                    ints[i][j] = 0;
                    ints[i][j+1] = 0;
                    ints[i][j+2] = 0;
                }
            }
        }

        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                int sum = ints[i][j] + ints[i][j+1] + ints[i][j+2];
                result = Math.max(result, sum);
            }
        }

        System.out.println(result + max);
    }
}