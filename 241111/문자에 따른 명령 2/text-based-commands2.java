import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int dire = 0;
        int x=0, y=0;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c=='L'){
                dire = (dire+3)%4;
            }else if(c == 'R'){
                dire = (dire+1)%4;
            }else if(c == 'F'){
                x+= dx[dire];
                y+= dy[dire];
            }
        }

        System.out.println(x+" "+y);
    }
}