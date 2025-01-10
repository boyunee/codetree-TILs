import java.util.*;
public class Main {
    public static int n,a,b,c;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int unlock = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    if((i >= a+3) && (j >= b+3) && (k >= c+3)){
                        unlock++;
                    }
                }
            }
        }

        System.out.println((int) Math.pow(n, 3) - unlock);
    }
}