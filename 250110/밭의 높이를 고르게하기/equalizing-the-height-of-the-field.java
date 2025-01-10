import java.util.*;
public class Main {
    public static int n,h,t;
    public static int[] b, clone;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextInt();
        t = sc.nextInt();
        b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        clone = b.clone();
        boolean match = false;
        int dif = 1;
        int count = 0;
        boolean minMatch = false;
        while(!match){
            for(int i=0; i<n; i++){
                if(Math.abs(h - b[i]) == dif){
                    b[i] += (h - b[i]);
                    minMatch = true;
                    break;
                }else{
                    minMatch = false;
                }
            }
            if(!minMatch){
                dif++;
                continue;
            }
            
            // for(int i=0; i<n; i++){
            //     System.out.print(b[i]);
            // }
            // System.out.println();
            for(int i=0; i<n-t; i++){
                for(int j=i; j<i+t; j++){
                    if(b[i] != h || b[j] != h){
                        count = 0;
                        match = false;
                        break;
                    }
                    match = true;
                    count += Math.abs(clone[j] - h);
                }
                if(match){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}