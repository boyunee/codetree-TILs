import java.util.*;
public class Main {
    public static int[] ints = new int[101];
    public static int nowIndex =50;
    public static int cnt=0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            lining(sc.nextInt(), sc.next());
        }
        for(int i=0; i<=100; i++){
            if(ints[i]>1&& ints[i+1]>1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void lining(int x, String direction){
        if(direction.equals("R")){
            for(int i=nowIndex; i<=nowIndex+x; i++){
                ints[i] +=1;
            }
            nowIndex +=x;
        }else{
            for(int i=nowIndex; i>=nowIndex-x; i--){
                ints[i] +=1;
            }
            nowIndex -=x;
        }
    }
}