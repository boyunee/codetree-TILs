import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for(int i =0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        int result = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                count += Math.abs(j - i) * ints[j];
            }
            result = Math.min(result, count);
        }

        System.out.println(result);
    }
}