import java.util.*;
public class Main {
    public static int[] dx={0,1,0,-1};
    public static int[] dy={1,0,-1,0};
    public static int x=0,y=0,t=0,d=0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.next().split("");

        int result =-1;
        for(int i=0; i<strs.length; i++){
            t++;
            if(strs[i].equals("L")){
                d= (d+3)%4;
            }else if(strs[i].equals("R")){
                d = (d+1)%4;
            }else{
                x+=dx[d];
                y+=dy[d];
                if(x==0 && y==0){
                    result = t;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}