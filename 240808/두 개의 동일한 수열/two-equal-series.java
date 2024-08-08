import java.util.*;
public class Main {
    public static int[] A,B;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = new int[n];
        B = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }
        System.out.println(check());
        
    }
    public static String check(){
        int count =0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i] == B[j]){
                    count++;
                }
            }
        }
        if(count == A.length){
            return "Yes";
        }else{
            return "No";
        }
    }
}