import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for(int i =0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        int max = 0;
        for(int i =0; i<n-2; i++){
            for(int j=i+2; j<n; j++){
                max = Math.max(max, ints[i]+ints[j]);
            }
        }
        System.out.println(max);
    }
}