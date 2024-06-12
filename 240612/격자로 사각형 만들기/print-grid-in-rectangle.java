import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[n][n];

        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0){
                    ints[i][j] = 1;
                }else {
                    ints[i][j] = ints[i-1][j-1] + ints[i-1][j] + ints[i][j-1];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ints[i][j] + " ");

            }
            System.out.println();
        }
    }
}