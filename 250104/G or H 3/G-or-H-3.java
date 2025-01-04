import java.util.*;
public class Main {
    public static int[] ints = new int[10000];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=0; i<n; i++){
            int index = sc.nextInt();
            String str = sc.next();
            if(str.equals("G")){
                ints[index-1] = 1;
            }else{
                ints[index-1] = 2;
            }
        }

        int max = 0;
        for(int i=0; i<10000 - k; i++){
            int sum =0;
            for(int j=i; j<=i+k; j++){
                sum+=ints[j];
            }
            max = Math.max(max, sum);

        }
        System.out.println(max);
    }
}