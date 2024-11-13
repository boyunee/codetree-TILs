import java.util.*;
public class Main {
    public static int[][] ints;
    public static int[] dx = {0,0,-1,1};
    public static int[] dy = {1,-1,0,0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ints = new int[n][n];
        for(int i=0; i<m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            ints[r-1][c-1] = 1;
            check(r,c, n);
        }
    }
    static void check(int r, int c, int n){
        int count =0;
        for(int i=0 ;i<4; i++){
            if(r+dx[i] >=1 && r+dx[i] <=n && c+dy[i] >=1 && c+dy[i] <= n){
                if(ints[r+dx[i]-1][c+dy[i]-1]==1){
                    count++;
                }
            }
        }
        if(count>=3){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}