import java.util.*;
public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        
        System.out.println(findMax(n-1));

    }
    public static int findMax(int m){
        if(m == 0){
            return ints[0];
        }
        return Math.max(findMax(m-1), ints[m]);
        

    }
}