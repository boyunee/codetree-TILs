import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ints = new int[n][m];
        
        int num = 1;
        for(int i=0; i<=n+m-2; i++){
            for(int j=0; j<m; j++){
                if(i - j < 0 || i - j >= m){
                    continue;
                }
                ints[j][i-j] =num;
                num++;
                

            }
        }

        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print(ints[i][j] + " ");
                if(j == m-1){
                    System.out.println("");
                }
            }
        }
    }
}