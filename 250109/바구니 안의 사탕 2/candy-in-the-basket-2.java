import java.util.*;
public class Main {
    public static final int MAX = 101;
    public static int n,k,d;
    public static int[] b = new int[MAX];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=0; i<n; i++){
            int candy = sc.nextInt();
            int x = sc.nextInt();
            b[x] += candy;
        }

        d = 2*k + 1;
        if(d>MAX){
            d = MAX - 1;
        }
        // System.out.println("간격은"+d);
        int max = 0;
        int sum = 0;
        for(int i=0; i<=MAX - d; i++){
            sum = 0;
            for(int j=i; j<i+d; j++){
                sum += b[j];
            }
            max = Math.max(sum, max);
            // System.out.println(max);/
        }

        System.out.println(max);

    }
}