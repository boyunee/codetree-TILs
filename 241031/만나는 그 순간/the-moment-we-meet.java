import java.util.*;
public class Main {
    public static int[] A= new int[1000000], B = new int[1000000];
    public static int n, m;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int nowA=0, nowB=0;
        A[0] = 0;
        B[0] = 0;
        for(int i=0; i<n; i++){
            String direction = sc.next();
            int move = sc.nextInt();
            if(direction.equals("R")){
                for(int j=nowA+1; j<=nowA+move; j++){
                    A[j] = A[j-1] +1;
                }
                nowA = nowA+move;
            }else{
                for(int j=nowA+1; j<=nowA+move; j++){
                    A[j] = A[j-1] -1;
                }
                nowA = nowA+move;
            }
        }
        for(int i=0; i<m; i++){
            String direction = sc.next();
            int move = sc.nextInt();
            if(direction.equals("R")){
                for(int j=nowB+1; j<=nowB+move; j++){
                    B[j] = B[j-1] +1;
                }
                nowB = nowB+move;
            }else{
                for(int j=nowB+1; j<=nowB+move; j++){
                    B[j] = B[j-1] -1;
                }
                nowB = nowB+move;
            }
        }
        solution();
    }
    static void solution(){
        for(int i=0; i<A.length; i++){
            if( i== 0 || A[i-1] == A[i] ){
                continue;
            }
            if(A[i] == B[i]){
                System.out.println(i);
                return;
            }
            
        }
        System.out.println(-1);
    }
}