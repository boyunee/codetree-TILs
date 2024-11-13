import java.util.*;
public class Main {
    public static int[] dx = {1,-1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static int x=0, y=0, t=0;
    public static int result = -1;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        
        for(int i=0; i<n; i++){
            String d = sc.next();
            int m = sc.nextInt();
            if(d.equals("E")){
                if(move(0, m)){
                    break;
                }
            }else if(d.equals("W")){
                if(move(1, m)){
                    break;
                }
            }else if(d.equals("S")){
                if(move(2, m)){
                    break;
                }
            }else{
                if(move(3, m)){
                    break;
                }
            }

        }

        System.out.println(result);
    }
    static boolean move(int index, int m){
        while(m-- > 0){
            x+=dx[index];
            y+=dy[index];
            t++;
            if(x==0 && y==0){
                result= t;
                return true;
            }
        }
        return false;
    }
}