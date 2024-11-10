import java.util.*;
public class Main {
    public static int[] A = new int[1000001];
    public static int[] B = new int[1000001];
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int now = 1;
        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                A[now] = A[now -1] + v;
                now++;
            }
        }
        now = 1;
        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                B[now] = B[now -1] + v;
                now++;
            }
        }

        int count =0;
        int state = 0;
        for(int i=1; i<now; i++){
            if(A[i] > B[i]){
                if(state != 1){
                    // System.out.println(i);
                    count++;
                }
                state = 1;
            }else if(A[i] < B[i]){
                if(state != 2){
                    // System.out.println(i);
                    count++;
                }
                state = 2;
            }else{
                if(state != 3){
                    // System.out.println(i);
                    count++;
                }
                state = 3;
            }

        }

        System.out.println(count);
    }
}