import java.util.*;
public class Main {
    public static int[] dx = new int[]{0,-1,1,0};
    public static int[] dy = new int[]{1,0,0,-1};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        String d = sc.next();

        
        int[][] ints = new int[n][n];
        int dir = getDir(d);

        int x=r, y=c;
        while(t-- > 0){
            if(!check(x, y, dir, n)){
                x+=dx[dir];
                y+=dy[dir];
                dir = 3- dir;
                // System.out.println(dir);
            }
            x+=dx[dir];
            y+=dy[dir];
        }
        System.out.println(x+" "+y);



    }
    static int getDir(String d){
        if(d.equals("R")){
            return 0;
        }else if(d.equals("L")){
            return 3;
        }else if(d.equals("U")){
            return 1;
        }else{
            return 2;
        }
    }
    static boolean check(int x, int y, int dir, int n){
        return (x+dx[dir]> 0) && (x+dx[dir] <=n) && (y+dy[dir] > 0) && (y+dy[dir]<=n);
    }

}