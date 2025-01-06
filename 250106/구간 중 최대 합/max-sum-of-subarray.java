import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ints = new int[n];
        for(int i =0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        int max = 0;
        for(int i =0; i<n-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum += ints[j];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}