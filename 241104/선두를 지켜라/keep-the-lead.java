import java.util.*;
public class Main {
    public static int[] A = new int[1000000 + 1];
    public static int[] B = new int[1000000 + 1];
    public static int now =1;
    public static boolean Awin;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            lineA(sc.nextInt(), sc.nextInt());
        }
        now = 1;
        for(int i=0; i<m; i++){
            lineB(sc.nextInt(), sc.nextInt());
        }

        // for(int i =0; i<now; i++){
        //     System.out.print(A[i]+" ");
        // }
        // System.out.println();
        // for(int i =0; i<now; i++){
        //     System.out.print(B[i]+" ");
        // }
        int count=0;
        // System.out.println(Awin);
        for(int i=0; i<now; i++){
            if(A[i]< B[i]){
                if(Awin){
                    count++;
                    Awin = false;
                    // System.out.println(i);
                }
                    
            }
            else if( A[i]> B[i]){
                if(!Awin){
                    count++;
                    Awin = true;
                    // System.out.println(i);
                }
            }
        }
        System.out.println(count);
    }
    static void lineA(int v, int m){
        while(m-- > 0){
            A[now] = A[now -1] + v;
            now++;
        }
    }
    static void lineB(int v, int m){
        while(m-- > 0){
            B[now] = B[now -1] + v;
            now++;
        }
    }
}