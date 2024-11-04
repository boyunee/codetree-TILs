import java.util.*;
public class Main {
    public static int[] A = new int[1000000 + 1];
    public static int[] B = new int[1000000 + 1];
    public static int now =1;
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

        int count=0;
        boolean Awin = false;
        if(A[1]> B[1]){
            Awin = true;
        }
        // System.out.println(Awin);
        for(int i=0; i<now; i++){
            if(Awin){
                if(A[i]< B[i]){
                    count++;
                    // System.out.println(i);
                    Awin = false;
                }
                
            }else{
                if(A[i]>B[i]){
                    count++;
                    // System.out.println(i);
                    Awin = true;
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