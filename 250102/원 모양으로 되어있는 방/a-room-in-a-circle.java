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

        int min = Integer.MAX_VALUE;
        int count =0;
        int sum = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            index = i;
            count = 0;
            sum = 0;
            while(++count<n){
                index++;
                // System.out.println(ints[(index)%n]+"*"+count);
                sum += ints[(index)%n] * count;
            }
            // System.out.println(sum);
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}