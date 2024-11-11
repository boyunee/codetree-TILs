import java.util.*;
public class Main {
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=0, y=0;
        for(int i=0; i<n; i++){
            String d = sc.next();
            int m = sc.nextInt();
            if(d.equals("E")){
                x+= dx[0]*m;
                y+= dy[0]*m;
            }else if(d.equals("W")){
                x+= dx[1]*m;
                y+= dy[1]*m;

            }else if(d.equals("S")){
                x+= dx[2]*m;
                y+= dy[2]*m;
                
            }else if(d.equals("N")){
                x+= dx[3]*m;
                y+= dy[3]*m;
                
            }
        }

        System.out.println(x+" "+y);
    }
}