import java.util.*;
public class Main {
    public static int[] x = new int[100];
    public static int[] y = new int[100];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int d = 0;
        int point = 1;
        int min = 100000;
        while(point < n-1){
            d = 0;
            for(int i=1; i<n; i++){
                if(i == point){
                    continue;
                }
                if(i == point+1){
                    d += Math.abs(x[i] - x[i-2])+Math.abs(y[i]-y[i-2]);
                    continue;
                }
                d += Math.abs(x[i] - x[i-1])+Math.abs(y[i]-y[i-1]);
            }
            min = Math.min(min, d);
            point++;
        }

        System.out.println(min);
    
    }
}