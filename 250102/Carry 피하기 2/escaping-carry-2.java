import java.util.*;

public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        int max = -1;
        int sum = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int l=j+1; l<n; l++){
                    if(ifCarry(ints[i],ints[j],ints[l])){
                        sum = ints[i] + ints[j] + ints[l];
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);


    }

    static boolean ifCarry(int a, int b, int c){

        while(a + b + c > 1){
            if((a%10 + b%10 + c%10) >=10){
                return false;
            }
            a/=10;b/=10;c/=10;
        }
        return true;
    }
}