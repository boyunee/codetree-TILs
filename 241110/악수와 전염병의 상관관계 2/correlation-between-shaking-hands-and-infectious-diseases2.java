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

        int t =0;
        for(int i=0; i<T; i++){
            t = sc.nextInt();
            xs[t] =sc.nextInt();
            ys[t] = sc.nextInt();
        }

        int count =0;
        for(int i=0; i<250; i++){
            if(xs[i] == 0){
                continue;
            }
            if(count >= K){
                break;
            }
            if(developers[xs[i] -1] == 1 || developers[ys[i] -1] == 1){
                developers[xs[i] -1] = 1;
                developers[ys[i] -1] = 1;
                count++;
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(developers[i]);
        }


    }
}