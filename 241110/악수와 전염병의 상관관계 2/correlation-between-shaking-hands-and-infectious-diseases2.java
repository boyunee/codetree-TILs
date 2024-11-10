import java.util.*;
public class Main {
    public static int[] xs = new int[251];
    public static int[] ys = new int[251];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[] developers = new int[N];
        developers[P-1] = 1;
        int[] count = new int[N];
        for(int i=0; i<N; i++){
            count[i] = K;
        }

        int t =0;
        for(int i=0; i<T; i++){
            t = sc.nextInt();
            xs[t] =sc.nextInt();
            ys[t] = sc.nextInt();
        }

        for(int i=0; i<250; i++){
            if(xs[i] == 0){
                continue;
            }
            int p1 = xs[i] -1 ;
            int p2 = ys[i] -1 ;
            // System.out.println(i +" "+ xs[i] +" "+ys[i]);
            if(developers[p1] == 1 && developers[p2] == 1){
                count[p1] -=1;
                count[p2] -=1;
            }
            else if(developers[p1] == 1 && count[p1] > 0){
                developers[p2] = 1;
                count[p1] -=1;
            }else if(developers[p2] == 1 && count[p2] > 0){
                developers[p1] = 1;
                    count[p2] -=1;
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(developers[i]);
        }


    }
}