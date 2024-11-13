import java.util.*;
public class Main {
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};
    public static int[][] ints;
    public static int n,m,dir,x,y;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ints = new int[n][m];
        dir = 0;

        int count =0;
        x=0;
        y=0;
        while(count++ < n*m){

            ints[x][y] = count;
            x+=dx[dir];
            y+=dy[dir];
            if(!check(x,y)){
                x-=dx[dir];
                y-=dy[dir];
                dir = (dir+1)%4;
                x+=dx[dir];
                y+=dy[dir];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }


    }
    static boolean check(int x, int y){
        return  x>=0 && x<n && y>=0 && y<m && ints[x][y]== 0;
    }
}