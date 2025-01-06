import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] ints= new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
            sum += ints[i];
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                min = Math.min(min, sum - ints[i] - ints[j] - s);
            }
        }
        System.out.println(Math.abs(min));
    }
}