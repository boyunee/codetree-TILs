import java.util.*;

public class Main {
    public static int[] A = new int[1000001];
    public static int[] B = new int[1000001];
    public static int nowA = 0;
    public static int nowB = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int t=0;
        String d= "";
        for(int i=0; i<n; i++){
            t = sc.nextInt();
            d = sc.next();

            while(t-- > 0){
                if(d.equals("R")){
                    nowA++;
                    A[nowA] = A[nowA -1 ] + 1;
                }else{
                    nowA++;
                    A[nowA] = A[nowA - 1 ]-1;
                }
            }
        }
        for(int i=0; i<m; i++){
            t = sc.nextInt();
            d = sc.next();

            while(t-- > 0){
                if(d.equals("R")){
                    nowB++;
                    B[nowB] = B[nowB -1 ] + 1;
                }else{
                    nowB++;
                    B[nowB] = B[nowB - 1 ]-1;
                }
            }
        }
        int min = Math.min(nowA, nowB);
        int max = Math.max(nowA, nowB);
        int count = 0;
        for(int i=0; i<=min; i++){
            if((i!=0) && (A[i - 1] != B[i-1]) && (A[i] == B[i])){
                // System.out.println(i);
                count++;
            }
        }
        for(int i=min + 1; i<=max; i++){
            if(max == nowA){
                if(B[min] == A[i] && B[min] != A[i-1]){
                    // System.out.println(i);
                    count++;
                }
            }else{
                if(A[min] == B[i] && A[min] != B[i-1]){
                    // System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}