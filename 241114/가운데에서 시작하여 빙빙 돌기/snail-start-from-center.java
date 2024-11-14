import java.util.*;
public class Main {
    public static int[] dx = {0,-1,0,1};
    public static int[] dy = {1,0,-1,0};
    public static int[][] ints;
    public static int n,dir,x,y;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ints = new int[n][n];
        dir = 3;

        int input =1;
        int count = 1;
        int t = 0;
        x=n/2;
        y=n/2;
        ints[x][y] = input;
        while(input <=n*n){
            dir = (dir+1)%4;
            for(int i=0; i<count; i++){
                input++;
                // System.out.println(input);
                x += dx[dir];
                y += dy[dir];
                if(input<=n*n){
                    ints[x][y] = input;
                }
            }
            t++;
            if(t%2==0){
                count++;
            }
            
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
    // static boolean check(int x, int y){
    //     return  x>=0 && x<n && y>=0 && y<m && ints[x][y]== 0;
    // }
}