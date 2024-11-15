import java.util.*;
public class Main {
    public static int x,y,result;
    public static int n;
    public static int[][] ints;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        ints = new int[n][n];
        String[] strs = sc.next().split("");
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ints[i][j] = sc.nextInt();
            }
        }
        x = n / 2;
        y = n / 2;
        result = ints[x][y];
        
        int dir =0;
        for(int i=0; i<t; i++){
            if(strs[i].equals("L")){
                dir = (dir+3)%4;
            }else if(strs[i].equals("R")){
                dir = (dir+1)%4;
            }else {
                move(dir);
            }
        }

        System.out.println(result);
    }

    static void move(int dir){
        int[] dx ={-1,0,1,0};
        int[] dy ={0,1,0,-1};
        
        if(inRange(x + dx[dir] , y + dy[dir])){
            x += dx[dir];
            y += dy[dir];
            result += ints[x][y];
        }
    }

    static boolean inRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }
}