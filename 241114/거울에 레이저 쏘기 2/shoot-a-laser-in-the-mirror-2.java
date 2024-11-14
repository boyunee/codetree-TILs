import java.util.*;
public class Main {
    public static int dir=0;
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,-1,0,1};
    public static int n;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[][] mirror = new String[n][n];
        for(int i=0; i<n; i++){
            String[] strs = sc.next().split("");
            for(int j=0; j<n; j++){
                mirror[i][j] = strs[j];
            }
        }
        int x=0, y=0;
        int input = sc.nextInt();
        if(input <= n){
            dir=0;
            x=0; y= input-1;
        }else if(input > n && input <=n*2){
            dir = 1;
            x=input-n-1; y=n-1;
        }else if(input >n*2 && input <=n*3){
            dir = 2;
            x=n-1; y=3*n-input;
        }else {
            dir = 3;
            x=4*n-input; y=0;
        }

        int count=0;
        while(inRange(x,y)){
            // System.out.println(x+" "+y+"dir:"+dir);
            if(mirror[x][y].equals("/")){
                dir = dir ^ 1;
            }else{
                dir = 3-dir;
            }
        
            x+=dx[dir];
            y+=dy[dir];
            count++;

        }
        System.out.println(count);


    }
    static boolean inRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }
}