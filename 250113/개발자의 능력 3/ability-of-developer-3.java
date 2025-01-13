import java.util.*;
public class Main {
    public static int sum1, sum2, sum;
    public static int[] ints;
    public static int getDiff(int i, int j, int k){
        sum1=0;
        sum2 =0;
        sum1 = ints[i] + ints[j] + ints[k];
        sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int len = 6;
        ints = new int[len];
        for(int i=0; i<len; i++){
            ints[i] = sc.nextInt();
            sum += ints[i];
        }
        // System.out.println(sum2);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                for(int k=j+1; k<len; k++){
                    min = Math.min(min, getDiff(i,j,k));
                }
            }
        }

        System.out.println(min);
    }
}